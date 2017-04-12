package com.searchapp.searcher;

import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class GoogleSearchEngine implements SearchEngine {
    private final String baseUrl = "http://www.google.com/search?q=";

    public URL generateUrl(String query) {
        try {
            return new URL(baseUrl + URLEncoder.encode(query, CHARSET));
        } catch (UnsupportedEncodingException e) {
            LoggerFactory.getLogger(GoogleSearchEngine.class).error("error" , e.fillInStackTrace());
        } catch (MalformedURLException e) {
            LoggerFactory.getLogger(GoogleSearchEngine.class).error("error" , e.fillInStackTrace());
        }
        return null;
    }
}
