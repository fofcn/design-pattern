package com.github.design.pattern.strategy;

public class DocumentParserContext {

    private DocumentParser documentParser;

    public DocumentParserContext(DocumentParser documentParser) {
        this.documentParser = documentParser;
    }

    public String processingDocument(String filePath) {
        return documentParser.processing(filePath);
    }

    public void setDocumentParser(DocumentParser documentParser) {
        this.documentParser = documentParser;
    }
}
