package com.searchapp.searcher;

import com.searchapp.data.DataSource;
import com.searchapp.data.NetworkDataSource;
import com.searchapp.io.ConsoleIO;
import com.searchapp.io.IOInterface;
import com.searchapp.parser.DocumentParser;
import com.searchapp.parser.ParserFactory;
import com.searchapp.parser.Result;
import org.jsoup.nodes.Document;

import java.net.URL;

/**
 * Created by tim_isakjanov on 4/11/17.
 */
public class Searcher {
    private IOInterface io;
    private SearchEngine engine;
    private DocumentParser parser;
    private DataSource dataSource;

    public Searcher() {
        io = ConsoleIO.getInstance();
        dataSource = new NetworkDataSource();
    }

    public void startSearchProcess() {
        String queryInput = promptQuery();
        String engineInput = promptEngine();

        engine = SearchEngineFactory.getSearchEngine(engineInput);
        parser = ParserFactory.getParser(engineInput);

        Result result = search(queryInput);
        displayResult(result);
    }

    private String promptQuery() {
        io.writeMessage("Enter query: ");
        return io.readMessage();
    }

    private String promptEngine() {
        io.writeMessage("Enter search engine (google or yahoo): ");
        return io.readMessage();
    }

    private void displayResult(Result result) {
        if (result.getError() != null) {
            io.writeMessage("error: " + result.getError());
        }
        io.writeMessage("title: " + result.getTitle());
        io.writeMessage("url: " + result.getUrl());
    }

    private Result search(String query) {
        URL url = engine.generateUrl(query);
        Document document = dataSource.getContent(url);
        return parser.parseDocument(document);
    }
}
