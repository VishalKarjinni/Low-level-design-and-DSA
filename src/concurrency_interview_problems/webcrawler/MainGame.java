package concurrency_interview_problems.webcrawler;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        // Initialize the WebCrawler and MockHtmlParser
        WebCrawler crawler = new WebCrawler();
        HtmlParse htmlParser = new MockHtmlParser();

        // Start crawling from the given URL
        List<String> result = crawler.crwal("http://news.yahoo.com/news/topics/", htmlParser);

        // Print the discovered URLs
        System.out.println("\nDiscovered URLs:");
        for (String url : result) {
            System.out.println(url);
        }
    }
}
