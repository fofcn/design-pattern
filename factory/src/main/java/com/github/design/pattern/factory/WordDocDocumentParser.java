package com.github.design.pattern.factory;

public class WordDocDocumentParser implements DocumentParser {
    public String processing(String filePath) {
        return WordDocDocumentParser.class.getCanonicalName();
    }
}
