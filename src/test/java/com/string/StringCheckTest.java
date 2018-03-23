package com.string;

import org.junit.Test;
import static org.junit.Assert.*;


public class StringCheckTest {

    StringCheck findLongestStringInStringArray = new StringCheck();

    @Test
    public void StringCheckValidInput(){
        String input ="The cow jumped over the moon.";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        assertEquals(longestStringAndLength.toString(),"6 and jumped");
    }

    @Test
    public void StringCheckEmptyInput(){
        String input ="";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        assertNull(longestStringAndLength.toString());
    }

    @Test
    public void StringCheckNulInput(){
        String input =null;
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        assertNull(longestStringAndLength);
    }
}
