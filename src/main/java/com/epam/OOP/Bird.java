package com.epam.OOP;

public class Bird extends Animal{

    public Bird(){
        super("blue",2, false);
    }

    @Override
    public String getDescription() {
        String hasFurStr ="no";
        String moreThanOnePaw ="paws";
        if (this.isHasFur()){
            hasFurStr ="a";
        }
        if(this.getNumberOfPaws()<2){
            moreThanOnePaw = "paw";
        }
        return "This animal is mostly "+this.getColor()+". It has "+this.getNumberOfPaws()+" "+moreThanOnePaw+" and "+hasFurStr+" fur. Moreover, it has 2 wings and can fly.";
    }

}
