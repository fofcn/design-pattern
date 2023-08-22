package com.github.design.pattern.strategy;

public class WordDocxDocumentParser implements DocumentParser {
    public String processing(String filePath) {
        return WordDocxDocumentParser.class.getCanonicalName() + filePath;
    }
}
