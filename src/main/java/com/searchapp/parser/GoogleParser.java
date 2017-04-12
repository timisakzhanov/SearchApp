package com.searchapp.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class GoogleParser implements DocumentParser {
    private String pattern = "#rso ._NId .srg .g .rc h3 a";

    public Result parseDocument(Document document) {
        Elements results = document.select(pattern);
        Element first = results.first();
        if (first == null) {
            return new Result(null, null, "Failed to parse response");
        }

        return new Result(first.text(), first.attr("href"), null);
    }
}
