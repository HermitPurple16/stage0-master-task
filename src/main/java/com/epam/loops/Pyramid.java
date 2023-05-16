package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i =1; i<=cathetusLength;i++){
            for(int j =1; j<(cathetusLength*2);j++){
                for(int k =1;k<=cathetusLength;k++){
                    if(j==cathetusLength-(k-1) || j==cathetusLength+(k-1) ){
                        if(i>=(k)){
                            System.out.print(k);
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
        new Pyramid().printPyramid(7);
    }

}
