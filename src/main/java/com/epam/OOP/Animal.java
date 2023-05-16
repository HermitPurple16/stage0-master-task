package com.epam.OOP;

public class Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String hasFurStr ="no";
        String moreThanOnePaw ="paws";
        if (hasFur){
            hasFurStr ="a";
        }
        if(this.numberOfPaws<2){
            moreThanOnePaw = "paw";
        }
        return "This animal is mostly "+ this.color +". It has "+ numberOfPaws+" "+moreThanOnePaw+" and "+hasFurStr+" fur.";
    }
}
