package com.github.design.pattern.strategy;

public class PDFDocumentParser implements DocumentParser {
    public String processing(String filePath) {
        return PDFDocumentParser.class.getCanonicalName() + filePath;
    }
}
