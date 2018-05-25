package com.sandbox;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SandboxTest {

    @Test
    public void testQuestionInput() {
        Map<String, String> map = splitToMap("A=4 H=X PO=87");
        assertEquals("4", map.get("A"));
        assertEquals("X", map.get("H"));
        assertEquals("87", map.get("PO"));
    }

    private Map<String, String> splitToMap(String in) {
        return Splitter.on(" ").withKeyValueSeparator("=").split(in);
    }

}