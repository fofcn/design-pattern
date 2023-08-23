package com.github.design.pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentParserDecoratorTest {

    @Test
    void givenFilePath_whenProcessingWithDecorator_thenReturnSameAsOriginal() {
        // Given
        DocumentParser pdfParser = new PDFDocumentParser();
        DocumentParser decoratedParser = new DocumentParserDecorator(pdfParser);
        String filePath = "/path/to/my/sample.pdf";

        // When
        String originalOutput = pdfParser.processing(filePath);
        String decoratedOutput = decoratedParser.processing(filePath);

        // Then
        assertEquals(originalOutput, decoratedOutput);
    }
}