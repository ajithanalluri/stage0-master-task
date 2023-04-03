package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int sum = 0;
        while( number > 0) {
            int remainder = number%10;
            sum = sum*10 + remainder;
            number = number/10;
        }
        System.out.println(sum);
    }

}
