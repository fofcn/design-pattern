package com.github.design.pattern.decorator;

public class DocumentParserJsonFormat extends DocumentParserDecorator{
    public DocumentParserJsonFormat(DocumentParser documentParser) {
        super(documentParser);
    }

    @Override
    public String processing(String filePath) {
        String content = super.processing(filePath);
        return formatJson(filePath, content);
    }

    private String formatJson(String filePath, String content) {
        return "{\"file\": \"" + filePath + "\", \"content\":\"" + content + "\"}";
    }
}
