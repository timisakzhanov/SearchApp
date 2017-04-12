package com.searchapp.parser;

import org.jsoup.nodes.Document;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public interface DocumentParser {
    Result parseDocument(Document document);
}
