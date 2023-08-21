package com.github.design.pattern.factory;

import java.util.Optional;

public class DefaultDocumentParserFactory implements DocumentParserFactory {

    @Override
    public DocumentParser createDocumentParser(DocumentType documentType) {
        Optional.ofNullable(documentType).orElseThrow(DocumentTypeIsNullException::new);

        if (DocumentType.WORD_DOC.equals(documentType)) {
            return new WordDocDocumentParser();
        } else if (DocumentType.WORD_DOCX.equals(documentType)) {
            return new WordDocxDocumentParser();
        } else if (DocumentType.PDF.equals(documentType)) {
            return new PDFDocumentParser();
        } else {
            throw new DocumentTypeIsInvalidException();
        }
    }

}
