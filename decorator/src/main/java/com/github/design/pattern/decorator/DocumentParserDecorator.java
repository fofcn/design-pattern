package com.github.design.pattern.decorator;

public class DocumentParserDecorator implements DocumentParser {

    protected DocumentParser documentParser;

    public DocumentParserDecorator(DocumentParser documentParser) {
        this.documentParser = documentParser;
    }

    @Override
    public String processing(String filePath) {
        return documentParser.processing(filePath);
    }
}
