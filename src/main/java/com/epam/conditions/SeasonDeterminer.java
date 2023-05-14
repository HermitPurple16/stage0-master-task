package com.epam.conditions;

public class SeasonDeterminer {

    public static void main(String[] args) {
        tellTheSeason(1);
    }
    public static void tellTheSeason(int monthNumber) {

        switch (monthNumber) {
            case  3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
                break;
            case 12,1,2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Wrong month number");;
                break;
        }
    }

}
