package concurrency_interview_problems.webcrawler;

import java.util.List;

public interface HtmlParse {
    List<String> getUrls(String url);
}
