package com.improve10x.fibonacci.farmproblem;

public class TheFarm {
    public int findAnimalLegs(int chickenLegs, int cowLegs, int pigLegs) {
        int AnimalLegs = chickenLegs + cowLegs + pigLegs;
        if (AnimalLegs == -1){
            return -1;
        }else if (AnimalLegs >=0){
            int noOfChickenLegs = chickenLegs * 2;
            int noOfCowLegs = cowLegs * 4;
            int noOfPigLegs = pigLegs * 4;
            int totalAnimalLegs = noOfChickenLegs + noOfCowLegs + noOfPigLegs;
            return totalAnimalLegs;
        }
        return AnimalLegs;
    }
}
// int noOfChickenLegs = chickenLegs * 2;
//        int noOfCowLegs = cowLegs * 4;
//        int noOfPigLegs = pigLegs * 4;
//        int totalAnimalLegs = noOfChickenLegs + noOfCowLegs + noOfPigLegs;
//        return totalAnimalLegs;
//
//