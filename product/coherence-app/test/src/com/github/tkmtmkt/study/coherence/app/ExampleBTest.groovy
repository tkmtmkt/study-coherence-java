package com.github.tkmtmkt.study.coherence.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.tkmtmkt.study.coherence.app.Example;

public class ExampleBTest {
    private Example example = new Example();

    @Test
    public void countString() {
        assertEquals(5, example.countString("Hello"));
        assertEquals(6, example.countString("漢字の文字数"));
    }
}
// vim: set ts=4 sw=4 et:
