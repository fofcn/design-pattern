package com.github.design.pattern.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordDocxDocumentParserTest {

    @Test
    void givenFilePath_whenProcessing_thenReturnCorrectOutput() {
        // Given
        WordDocxDocumentParser parser = new WordDocxDocumentParser();
        String filePath = "/path/to/my/sample.docx";
        String expectedOutput = WordDocxDocumentParser.class.getCanonicalName() + filePath;

        // When
        String actualOutput = parser.processing(filePath);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

}
