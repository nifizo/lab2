package com.example;

import com.example.parser.XSDChecker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class XSDCheckerTest {

    @Test
    public void ValidateTest() {
        boolean valid = XSDChecker.apply(Strings.KNIFES_PATH, Strings.KNIFES_XSD_PATH);
        assertTrue(valid);
    }
}
