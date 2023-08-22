package com.github.design.pattern.strategy;

public class WordDocDocumentParser implements DocumentParser {
    public String processing(String filePath) {
        return WordDocDocumentParser.class.getCanonicalName() + filePath;
    }
}
