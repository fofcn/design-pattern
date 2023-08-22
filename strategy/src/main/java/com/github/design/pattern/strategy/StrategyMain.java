package com.github.design.pattern.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        DocumentParser documentParser = new WordDocDocumentParser();
        DocumentParserContext documentParserContext = new DocumentParserContext(documentParser);
        var wordText = documentParserContext.processingDocument("mock.word.doc");
        System.out.println(wordText);

        documentParser = new PDFDocumentParser();
        documentParserContext.setDocumentParser(documentParser);
        var pdfText = documentParserContext.processingDocument("mock.pdf.pdf");
        System.out.println(pdfText);
    }
}
