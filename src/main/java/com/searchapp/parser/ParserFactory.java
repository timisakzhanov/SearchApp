package com.searchapp.parser;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class ParserFactory {
    public static DocumentParser getParser(String type) {
        if (type.equals("google")) {
            return new GoogleParser();
        }
        if (type.equals("yahoo")) {
            return new YahooParser();
        }
        return null;
    }
}
