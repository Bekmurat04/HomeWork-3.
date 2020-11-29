package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int kol = 0;
        boolean isOtr = false;
        double[] num = {7.0, -3.0, 8.0, -2.0, 5.0, 1.0, -4.0, 7.0, 4.0, -6.0, 9.0, 2.0, -9.0, 5.0, -0.5};
        for (double num1 : num) {
            if (num1 < 0) {
                isOtr = true;

            }else{
                if(isOtr){
                    kol++;
                    sum+=num1;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(sum/kol);
    }
}