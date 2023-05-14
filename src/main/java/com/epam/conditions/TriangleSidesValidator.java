package com.epam.conditions;

import java.util.Arrays;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if(firstSide+secondSide>thirdSide & thirdSide+secondSide>firstSide & firstSide+thirdSide>secondSide){
            System.out.println("this is a valid triangle");
        } else{
            System.out.println("it's not a triangle");
        }
    }
}
