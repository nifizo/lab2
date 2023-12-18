package com.example;

import com.example.parser.DOMParser;
import lombok.SneakyThrows;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class DOMParserTest {

    @Test
    @SneakyThrows
    public void parseTest() {
        var devices = Objects.requireNonNull(DOMParser.apply(Strings.KNIFES_PATH)).getKnifes( );
        assertEquals(devices.size(), 3);
        assertEquals(devices.get(0), MockData.knife);
    }
}
