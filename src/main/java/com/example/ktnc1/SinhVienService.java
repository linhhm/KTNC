package com.example.ktnc1;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> lss = new ArrayList<>();
    public String addSV(SinhVien sv){
        lss.add(sv);
        return "them thanh cong";
    }
    public List<SinhVien> search(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("KO đc để trống");
        }
        for (SinhVien sv : lss){
            if (sv.getTen().equalsIgnoreCase(name)){
                lss.add(sv);
            }
        }
        return lss;
    }
}
