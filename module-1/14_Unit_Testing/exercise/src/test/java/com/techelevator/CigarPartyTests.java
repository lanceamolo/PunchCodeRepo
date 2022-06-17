package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {
    //    haveParty(30, false) → false
    //    haveParty(50, false) → true
    //    haveParty(70, true) → true

    //create object to access haveParty method
    CigarParty cigarPartyClass = new CigarParty();

    //use Assert.assertsEquals method to compare true and false results
    @Test
    public void cigarPartyTest(){
        Assert.assertEquals(false, cigarPartyClass.haveParty(30, false));
        Assert.assertEquals(true, cigarPartyClass.haveParty(50, false));
        Assert.assertEquals(true, cigarPartyClass.haveParty(70, true));
    }
}
