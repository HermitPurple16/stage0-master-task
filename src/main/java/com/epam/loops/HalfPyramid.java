package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i =1; i<=cathetusLength;i++){
            for(int j =1; j<(cathetusLength*2);j++){
                for(int k =1;k<=cathetusLength;k++){
                    if(j==cathetusLength-(k-1) ){
                        if(i>=(k)){
                            System.out.print('*');
                        } else if(j==cathetusLength+(k-1) ){
                        } else if(j==cathetusLength-(k-1) ){
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
