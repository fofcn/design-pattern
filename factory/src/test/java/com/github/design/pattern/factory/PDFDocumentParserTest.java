package com.github.design.pattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PDFDocumentParserTest {

    @Test
    void givenFilePath_whenProcessing_thenReturnCorrectOutput() {
        // Given
        PDFDocumentParser parser = new PDFDocumentParser();
        String filePath = "/path/to/my/sample.pdf";
        String expectedOutput = PDFDocumentParser.class.getCanonicalName() + filePath;

        // When
        String actualOutput = parser.processing(filePath);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

}
