package com.jhkj.weapp.common.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class StringUtilsTest {

    @Test
    public void isNullOrEmpty() {
        String nullString = null;
        String emptyString = "";
        String normalString = "hello world";
        assertTrue(StringUtils.isNullOrEmpty(nullString));
        assertTrue(StringUtils.isNullOrEmpty(emptyString));
        assertFalse(StringUtils.isNullOrEmpty(normalString));
    }

    @Test
    public void listToString() {
        List<String> data = new ArrayList();
        data.add("hello");
        data.add("world");
        String result = StringUtils.listToString(data, ",");
        assertEquals("hello,world", result);
    }

    @Test
    public void stringToList() {
        String text = "hello#world";
        List<String> result = StringUtils.stringToList(text, "#");
        assertEquals("hello", result.get(0));
        assertEquals("world", result.get(1));
    }

}