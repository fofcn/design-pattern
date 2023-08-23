package com.github.design.pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentParserJsonFormatTest {

    @Test
    void givenFilePath_whenProcessingWithJsonFormatDecorator_thenReturnFormattedJson() {
        // Given
        DocumentParser pdfParser = new PDFDocumentParser();
        DocumentParser jsonFormattedParser = new DocumentParserJsonFormat(pdfParser);
        String filePath = "/path/to/my/sample.pdf";
        String expectedJsonOutput = "{\"file\": \"" + filePath + "\", \"content\":\"" +
                PDFDocumentParser.class.getCanonicalName() + filePath + "\"}";

        // When
        String actualJsonOutput = jsonFormattedParser.processing(filePath);

        // Then
        assertEquals(expectedJsonOutput, actualJsonOutput);
    }
}
