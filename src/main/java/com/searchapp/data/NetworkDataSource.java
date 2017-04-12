package com.searchapp.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class NetworkDataSource implements DataSource {
    public Document getContent(URL url) {
        if (url == null) {
            return null;
        }

        try {
            return Jsoup.connect(url.toString()).get();
        } catch (MalformedURLException e) {
            LoggerFactory.getLogger(NetworkDataSource.class).error("error" , e.fillInStackTrace());
        } catch (IOException e) {
            LoggerFactory.getLogger(NetworkDataSource.class).error("error" , e.fillInStackTrace());
        }
        return null;
    }
}
