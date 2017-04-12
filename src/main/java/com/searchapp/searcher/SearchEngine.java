package com.searchapp.searcher;

import java.net.URL;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public interface SearchEngine {
    static String CHARSET = "UTF-8";

    URL generateUrl(String query);
}
