package com.github.design.pattern.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordDocDocumentParserTest {

    @Test
    void givenFilePath_whenProcessing_thenReturnCorrectOutput() {
        // Given
        WordDocDocumentParser parser = new WordDocDocumentParser();
        String filePath = "/path/to/my/sample.doc";
        String expectedOutput = WordDocDocumentParser.class.getCanonicalName() + filePath;

        // When
        String actualOutput = parser.processing(filePath);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

}
