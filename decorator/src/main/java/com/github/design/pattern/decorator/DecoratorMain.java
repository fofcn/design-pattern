package com.github.design.pattern.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        DocumentParser documentParser = new PDFDocumentParser();
        DocumentParserDecorator documentParserDecorator = new DocumentParserJsonFormat(documentParser);

        String pdfPath = "mock.pdf.pdf";
        System.out.println("Raw output: " + documentParser.processing(pdfPath));
        System.out.println("Decorator output: " + documentParserDecorator.processing(pdfPath));
    }
}
