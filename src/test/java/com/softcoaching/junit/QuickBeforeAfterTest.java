package com.softcoaching.junit;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by afilipescu on 3/29/16.
 */
public class QuickBeforeAfterTest {


    private StringHelper helper = new StringHelper();
    private String actual = helper.truncateAInFirst2Positions("AACDAA");
    private String expected = "CDAA";

    @org.junit.Test
    @After
    public void truncateAInFirst2Positions() throws Exception {
        assertEquals(actual,expected);
    }

    @org.junit.Test
    @Before
    public void areFirstAndLastTwoCharactersTheSameFalse() throws Exception {
        assertFalse("The condition failed!", helper.areFirstAndLastTwoCharactersTheSame(actual));
    }
}
