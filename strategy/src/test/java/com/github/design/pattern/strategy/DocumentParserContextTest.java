package com.github.design.pattern.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentParserContextTest {

    @Test
    void givenDocumentParser_whenProcessingDocument_thenReturnCorrectOutput() {
        // Given
        String filePath = "/path/to/my/sample.docx";
        DocumentParser docxParser = new WordDocxDocumentParser();
        DocumentParserContext context = new DocumentParserContext(docxParser);

        // When
        String expectedOutput = WordDocxDocumentParser.class.getCanonicalName() + filePath;
        String actualOutput = context.processingDocument(filePath);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenDocumentParser_whenSetDocumentParser_thenUpdatedParserIsUsed() {
        // Given
        String filePath = "/path/to/my/sample.doc";
        DocumentParser docxParser = new WordDocxDocumentParser();
        DocumentParser docParser = new WordDocDocumentParser();
        DocumentParserContext context = new DocumentParserContext(docxParser);

        // When
        String expectedOutput = WordDocDocumentParser.class.getCanonicalName() + filePath;
        context.setDocumentParser(docParser);
        String actualOutput = context.processingDocument(filePath);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenPDFDocumentParser_whenProcessingDocument_thenReturnCorrectOutput() {
        // Given
        String filePath = "/path/to/my/sample.pdf";
        DocumentParser pdfParser = new PDFDocumentParser();
        DocumentParserContext context = new DocumentParserContext(pdfParser);

        // When
        String expectedOutput = PDFDocumentParser.class.getCanonicalName() + filePath;
        String actualOutput = context.processingDocument(filePath);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

}
