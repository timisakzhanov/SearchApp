package com.searchapp.searcher;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class SearchEngineFactory {
    public static SearchEngine getSearchEngine(String type) {
        if (type.equals("google")) {
            return new GoogleSearchEngine();
        }
        if (type.equals("yahoo")) {
            return new YahooSearchEngine();
        }
        return null;
    }
}
