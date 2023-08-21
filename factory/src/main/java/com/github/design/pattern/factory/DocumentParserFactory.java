package com.github.design.pattern.factory;

public interface DocumentParserFactory {

    DocumentParser createDocumentParser(DocumentType documentType);

}
