package com.jhkj.weapp.common.util;

import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertEquals;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class InstantUtilsTest {

    @Test
    public void convertInstant() {
        String raw = "1996-02-03 22:33:44";
        Instant instant = InstantUtils.stringToInstant(raw);
        String string = InstantUtils.instantToString(instant);
        assertEquals(raw, string);
    }

}