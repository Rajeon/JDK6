package com.company;

import java.util.Arrays;

public class Break {
    public static void main(String[] args) {

        String[] colors = {"Black", "Green", "Red", "Yellow", "Blue", "White"};
        for (int x = 0; x < colors.length; x++)
        {
            System.out.println(colors[x]);

            int[] window = {1,3,5,9};

            int total =0;

            for(int w = 0; w < window.length; w++){

                total += window[w];

                System.out.println(total);

            }






        }
    }
}
//        for (int p = 10; p > 0; p--){
//            if(p == 5){
//                continue;
//            }
//            System.out.println("Loop" + p + "times");














