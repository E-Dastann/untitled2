package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] arr) {
        double[] arrays = {10, 9, 3, 2, 1, 4,5, 6, 8};
        for (int i = 0; i < arrays.length; i++) {
            double min = arrays[i];
            for (int j = i; j < arrays.length; j++) {
                if (min > arrays[j]) {
                    double max = min;
                    min = arrays[j];
                    arrays[j] = max;

                }
            }

            arrays[i] = min;

        }
        System.out.println(Arrays.toString(arrays));

    }
}