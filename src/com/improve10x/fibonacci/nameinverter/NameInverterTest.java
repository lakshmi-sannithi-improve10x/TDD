package com.improve10x.fibonacci.nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    private NameInverter nameInverter;
    @BeforeEach
    public void setup(){
         nameInverter = new NameInverter();
    }
    @Test
    public void nothing(){

    }

    // input name = ""; output = "";
    @Test
    public void givenEmpty_returnEmpty(){
        String nameInverted = nameInverter.invertName("");
        assertEquals("",nameInverted);
    }

    // input name = "name"; output = "name";
    @Test
    public void givenName_returnName(){
        String singleWord = nameInverter.invertName("name");
        assertEquals("name",singleWord);
    }

    @Test
    public void givenSingleWordWithEndingSpace_returnSingleWord(){
        String singleWordWithSpace = nameInverter.invertName("name ");
        assertEquals("name",singleWordWithSpace);
    }

    @Test
    public void givenSingleWordWithBeginningSpace_returnSingleWord(){
        String singleWordWithSpace = nameInverter.invertName("  name ");
        assertEquals("name",singleWordWithSpace);
    }

    @Test
    public void givenFirstLast_returnLastFirst(){
      String invertedName = nameInverter.invertName("first last");
      assertEquals("last, first",invertedName);
    }

    @Test
    public void givenHonorifics_returnIgnoreHonorifics(){
        String singleWordWithSpace = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first",singleWordWithSpace);
    }

    @Test
    public void givenMrHonorifics_returnIgnoreHonorifics(){
        String singleWordWithSpace = nameInverter.invertName("Mr. first last");
        assertEquals("last, first",singleWordWithSpace);
    }

    @Test
    public void givenLastMscHonorifics_returnIgnoreHonorifics(){
        String singleWordWithSpace = nameInverter.invertName("first last Msc.");
        assertEquals("last, first Msc.",singleWordWithSpace);
    }

    @Test
    public void givenLastMscPhdHonorifics_returnIgnoreHonorifics(){
        String singleWordWithSpace = nameInverter.invertName("first last Msc. Phd.");
        assertEquals("last, first Msc.",singleWordWithSpace);
    }
}
