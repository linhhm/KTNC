package com.example.ktnc1;

public class CongThuc {
    public int mang(int[] arr){
        if (arr ==  null || arr.length ==0){
            throw new IllegalArgumentException("mang rỗng");
        }
        int a = 0;
        for (int sum : arr){
            a+= sum;
        }
        return a;
    }

    public int findMax(int[] sum){
        int max = sum[sum.length-1];
        return max;
    }
}
