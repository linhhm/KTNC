package com.example.ktnc1;

import java.util.Arrays;

public class ArraySum {
   public static int sum(int[] arr){
       if (arr == null || arr.length == 0){
           throw new IllegalArgumentException("ko đc để trống");
       }
       int a = 0;
       for (int num : arr){
           a+=num;

       }
       return a;
   }
   public int cong(int a, int b){
       return a+b;
   }
   public double chia (int a, int b){
       if (b == 0){
           throw new IllegalArgumentException("sai quy tắc");
       }
       return (double) a/b;
   }
   public String xepLoai(double diemTB){
       if (diemTB > 10 || diemTB < 0){
           throw new IllegalArgumentException("Điem ko đúng");
       }else if (diemTB < 8) {
           return "Khá";
       }else {
           return "Giỏi";
       }
   }
   public int findMax(int[] arrNum){
       if (arrNum == null || arrNum.length ==0){
           throw  new IllegalArgumentException("ko đc bỏ trống");
       }
       Arrays.sort(arrNum);
       int index = arrNum.length-1;
       int max = arrNum[index];
       return max;
   }
}
