package com.example;

import com.example.parser.SAXParser;
import lombok.SneakyThrows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SAXParserTest {
    @Test
    @SneakyThrows
    public void parseTest() {
        var papers = SAXParser.apply(Strings.KNIFES_PATH).getKnifes();
        assertEquals(papers.size(), 3);
        assertEquals(papers.get(0), MockData.knife);
    }
}
