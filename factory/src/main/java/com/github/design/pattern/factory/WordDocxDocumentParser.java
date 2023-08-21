package com.github.design.pattern.factory;

public class WordDocxDocumentParser implements DocumentParser {
    public String processing(String filePath) {
        return WordDocxDocumentParser.class.getCanonicalName() + filePath;
    }
}
