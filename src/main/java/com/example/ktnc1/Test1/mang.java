package com.example.ktnc1.Test1;

public class mang {
    public int calculateSum(int[] array) {
        int sum = 0;

        if (array != null) {
            for (int num : array) {
                sum += num;
            }
        }

        return sum;
    }
}
