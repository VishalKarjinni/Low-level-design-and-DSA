package concurrency_interview_problems.webcrawler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class WebCrawler {
    private String hostName;
    private ConcurrentHashMap<String, Boolean> urlHashMap = new ConcurrentHashMap<String, Boolean>();
    private ExecutorService executorsService = Executors.newFixedThreadPool(5);
    private AtomicInteger numOfUrlsToParse = new AtomicInteger(0);
    private HtmlParse htmlParse;

    class Task implements Runnable {

        private String url;

        Task (String url) {
            this.url = url;
        }

        @Override
        public void run() {
            for (String extractedUrl : htmlParse.getUrls(url)) {
                 String curHostName = extractedUrl.split("/")[2];
                 if (curHostName.equals(hostName) && urlHashMap.put(extractedUrl, true) == null) {
                       numOfUrlsToParse.addAndGet(1);
                       executorsService.submit(new Task(extractedUrl));
                 }
            }
            numOfUrlsToParse.addAndGet(-1);
        }
    }

    public List crwal(String startUrl, HtmlParse htmlParse) {
        hostName = startUrl.split("/")[2];
        this.htmlParse = htmlParse;
        urlHashMap.put(startUrl, true);
        numOfUrlsToParse.addAndGet(1);
        executorsService.submit(new Task(startUrl));

        while (numOfUrlsToParse.get() > 0) {
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executorsService.shutdown();

        // Return all discovered URLs
        return new ArrayList<>(urlHashMap.keySet());
    }
 }
