package com.github.design.pattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultDocumentParserFactoryTest {

    @Test
    void givenDocumentTypeIsNull_whenCreateDocumentParser_thenThrowException() {
        // Given
        DefaultDocumentParserFactory factory = new DefaultDocumentParserFactory();
        DocumentType documentType = null;

        // When & Then
        assertThrows(DocumentTypeIsNullException.class, () -> factory.createDocumentParser(documentType));
    }

    @Test
    void givenDocumentTypeIsWordDoc_whenCreateDocumentParser_thenReturnWordDocDocumentParser() {
        // Given
        DefaultDocumentParserFactory factory = new DefaultDocumentParserFactory();
        DocumentType documentType = DocumentType.WORD_DOC;

        // When
        DocumentParser documentParser = factory.createDocumentParser(documentType);

        // Then
        assertTrue(documentParser instanceof WordDocDocumentParser);
    }

    @Test
    void givenDocumentTypeIsWordDocx_whenCreateDocumentParser_thenReturnWordDocxDocumentParser() {
        // Given
        DefaultDocumentParserFactory factory = new DefaultDocumentParserFactory();
        DocumentType documentType = DocumentType.WORD_DOCX;

        // When
        DocumentParser documentParser = factory.createDocumentParser(documentType);

        // Then
        assertTrue(documentParser instanceof WordDocxDocumentParser);
    }

    @Test
    void givenDocumentTypeIsPDF_whenCreateDocumentParser_thenReturnPDFDocumentParser() {
        // Given
        DefaultDocumentParserFactory factory = new DefaultDocumentParserFactory();
        DocumentType documentType = DocumentType.PDF;

        // When
        DocumentParser documentParser = factory.createDocumentParser(documentType);

        // Then
        assertTrue(documentParser instanceof PDFDocumentParser);
    }

    @Test
    void givenDocumentTypeIsInvalid_whenCreateDocumentParser_thenThrowException() {
        // Given
        DefaultDocumentParserFactory factory = new DefaultDocumentParserFactory();
        DocumentType documentType = DocumentType.UNKNOWN;

        // When & Then
        assertThrows(DocumentTypeIsInvalidException.class, () -> factory.createDocumentParser(documentType));
    }

}
