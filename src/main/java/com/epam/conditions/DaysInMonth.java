package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println(31);
                break;
            case 4,6,9,11:
                System.out.println(30);
                break;
            case 2:
                if(year%4==0&year>1999){
                    System.out.println(29);
                }else if( (year%4==0&year<2000) | year%4!=0){
                    System.out.println(28);
                }
                break;
            default:
                System.out.println("invalid date");
                break;
            }

    }

}
