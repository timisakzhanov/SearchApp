package com.searchapp.data;

import org.jsoup.nodes.Document;

import java.net.URL;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public interface DataSource {
    Document getContent(URL url);
}
