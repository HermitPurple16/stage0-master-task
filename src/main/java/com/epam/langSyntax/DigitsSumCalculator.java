package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int answer=0;
        String numberStr = Integer.toString(number);

        for(int i =0; i<numberStr.length(); i++){
            answer += Integer.parseInt(String.valueOf(numberStr.charAt(i)));
        }
        System.out.println(answer);
    }

}
