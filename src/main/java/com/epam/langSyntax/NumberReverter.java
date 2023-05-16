package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String strNum = ""+number;
        char[] numCh = new char[3];
        int j=numCh.length-1;
        for (int i=0; i<numCh.length; i++){
            numCh[i]=strNum.charAt(j);
            j--;
        }
        number=0;
        strNum="";
        for(int i=0;i< numCh.length;i++){
            strNum = (strNum +""+ numCh[i]);
        }
        number = Integer.parseInt(strNum);
        System.out.println(number);
    }
}
