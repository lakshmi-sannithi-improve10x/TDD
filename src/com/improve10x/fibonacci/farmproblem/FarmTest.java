package com.improve10x.fibonacci.farmproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmTest {

    private TheFarm theFarm;

    @BeforeEach
    public void setup() {
        theFarm = new TheFarm();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNoOfAnimalsLegsEmpty_returnsTotalAnimalsLegsEmpty() {
        int animalLegs = theFarm.findAnimalLegs(-1, -1, -1);
        assertEquals(0, animalLegs);
    }

    @Test
    public void givenTwoANdFourAndFourAnimals_returnsTotalAnimalLegsThirtySix() {
        int animalLegs = theFarm.findAnimalLegs(2, 4, 4);
        assertEquals(36, animalLegs);
    }

    @Test
    public void givenTwoANdThreeAndFiveAnimals_returnsTotalAnimalLegsThirtySix() {
        int animalLegs = theFarm.findAnimalLegs(2, 3, 5);
        assertEquals(36, animalLegs);
    }


    @Test
    public void givenTwoANdThreeAndFiveAnimals_returnsTotalAnimalLegsTwentyTwo() {
        int animalLegs = theFarm.findAnimalLegs(1, 3, 2);
        assertEquals(22, animalLegs);
    }

    @Test
    public void givenFiveANdTwoAndEightAnimals_returnsTotalAnimalLegsFifty() {
        int animalLegs = theFarm.findAnimalLegs(5, 2, 8);
        assertEquals(50, animalLegs);
    }

    @Test
    public void givenTenANdTenAndTenAnimals_returnsTotalAnimalLegsHundred() {
        int animalLegs = theFarm.findAnimalLegs(10, 10, 10);
        assertEquals(100, animalLegs);
    }

}
