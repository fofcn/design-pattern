package com.github.design.pattern.factory;

public class FactoryMain {

    public static void main(String[] args) {
        DocumentParserFactory documentParserFactory = new DefaultDocumentParserFactory();
        DocumentParser pdfDocumentParser = documentParserFactory.createDocumentParser(DocumentType.PDF);
        String pdfContent = pdfDocumentParser.processing("mock.pdf");
        System.out.println(pdfContent);
    }
}
