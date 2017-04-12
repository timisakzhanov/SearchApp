package com.searchapp.searcher;

import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class YahooSearchEngine implements SearchEngine {
    String baseUrl = "https://search.yahoo.com/search?p=";

    public URL generateUrl(String query) {
        try {
            return new URL(baseUrl + URLEncoder.encode(query, CHARSET));
        } catch (UnsupportedEncodingException e) {
            LoggerFactory.getLogger(YahooSearchEngine.class).error("error" , e.fillInStackTrace());
        } catch (MalformedURLException e) {
            LoggerFactory.getLogger(YahooSearchEngine.class).error("error" , e.fillInStackTrace());
        }
        return null;
    }
}
