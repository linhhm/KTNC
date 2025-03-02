package com.example.ktnc1.Test1;

public class xepLoaiHocLuc {
    public String hocLuc(double diemTB){
        if (diemTB >= 10 || diemTB <=0){
            throw new IllegalArgumentException("diemTB must be between 0 and 10");
        }else if (diemTB >= 0 && diemTB <=5){
            return "Yếu";
        }else if (diemTB >= 5.5 && diemTB <=7.5){
            return "Trung bình";
        }else if (diemTB >= 7.5 && diemTB <= 8.5) {
            return "Khá";
        } else{
            return "Giỏi";
        }
    }
}
