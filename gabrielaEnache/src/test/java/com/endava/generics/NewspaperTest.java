package com.endava.generics;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

public class NewspaperTest {
    private Newspaper newspaper;

    @Before
    public void setUp() {
        newspaper = new Newspaper("Chisinau News", "Aderarul", 9f, "Chisinau");
    }

    @Test
    public void setCityTest() {
        newspaper.setCity("Balti");
        assertEquals(format("City has been changed to "), "Balti", newspaper.getCity());
    }
}