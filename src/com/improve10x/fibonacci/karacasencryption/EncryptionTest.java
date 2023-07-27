package com.improve10x.fibonacci.karacasencryption;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnaca(){
        Encryption encryption = new Encryption();
        String value = encryption.encrypt(null);
        assertEquals("aca",value);
    }

    @Test
    public void givenEmpty_returnaca(){
        Encryption encryption = new Encryption();
        String value = encryption.encrypt("");
        assertEquals("aca",value);
    }

    @Test
    public void givenb_returnbaca(){
        Encryption encryption = new Encryption();
        String bvalue = encryption.encrypt("b");
        assertEquals("baca",bvalue);
    }

    @Test
    public void givenc_returncaca(){
        Encryption encryption = new Encryption();
        String bvalue = encryption.encrypt("c");
        assertEquals("caca",bvalue);
    }

    @Test
    public void givenz_returnzaca(){
        Encryption encryption = new Encryption();
        String zvalue = encryption.encrypt("z");
        assertEquals("zaca",zvalue);
    }

    @Test
    public void givena_return0aca(){
        Encryption encryption = new Encryption();
        String avalue = encryption.encrypt("a");
        assertEquals("0aca",avalue);
    }

    @Test
    public void givene_return1aca(){
        Encryption encryption = new Encryption();
        String evalue = encryption.encrypt("e");
        assertEquals("1aca",evalue);
    }

    @Test
    public void giveni_return2aca(){
        Encryption encryption = new Encryption();
        String ivalue = encryption.encrypt("i");
        assertEquals("2aca",ivalue);
    }

    @Test
    public void giveno_return3aca(){
        Encryption encryption = new Encryption();
        String ovalue = encryption.encrypt("o");
        assertEquals("3aca",ovalue);
    }

    @Test
    public void givenu_return4aca(){
        Encryption encryption = new Encryption();
        String uvalue = encryption.encrypt("u");
        assertEquals("4aca",uvalue);
    }

    @Test
    public void givenbg_returngbaca(){
        Encryption encryption = new Encryption();
        String bgvalue = encryption.encrypt("bg");
        assertEquals("gbaca",bgvalue);
    }
}
