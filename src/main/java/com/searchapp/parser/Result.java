package com.searchapp.parser;

public class Result {
    private final String title;
    private final String url;
    private final String error;

    public Result(String title, String url, String error) {
        this.title = title;
        this.url = url;
        this.error = error;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getError() {
        return error;
    }
}
