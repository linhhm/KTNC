package com.example.ktnc1;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> list = new ArrayList<>();

    public String addSV(SinhVien sv) {
        if (list.contains(sv)) {
            throw new IllegalArgumentException("sinh vien da ton tai");
        }
        if (sv == null) {
            throw new IllegalArgumentException("sv ko dc trong");
        }
        list.add(sv);
        return "them thanh cong";
    }

    public List<SinhVien> searchNam(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("ko dc trong");
        }
            for (SinhVien sinhVien : list) {
                if (sinhVien.getTen().equalsIgnoreCase(name)) {
                    list.add(sinhVien);
                }
            }
        return list;
        }
}
