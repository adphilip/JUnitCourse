package com.softcoaching.junit;

import static org.junit.Assert.*;

/**
 * Created by afilipescu on 3/29/16.
 */
public class StringHelperTest {

    private StringHelper helper = new StringHelper();
    private String expected = "CD";

    @org.junit.Test
    public void truncateAInFirst2Positions() throws Exception {
        String actual = helper.truncateAInFirst2Positions("AACD");
        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void truncateAInFirst2Positions2() throws Exception {
        String expected = "BD";
        assertEquals(expected, helper.truncateAInFirst2Positions("ABD"));
    }

    @org.junit.Test
    public void areFirstAndLastTwoCharactersTheSame() throws Exception {
        assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("AAdfdafAA"));

    }

    @org.junit.Test
    public void areFirstAndLastTwoCharactersTheSameFalse() throws Exception {
        assertFalse("The condition failed!",helper.areFirstAndLastTwoCharactersTheSame("AdfdafAA"));
    }
}