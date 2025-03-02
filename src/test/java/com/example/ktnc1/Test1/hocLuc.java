package com.example.ktnc1.Test1;

import org.junit.jupiter.api.Test;

public class hocLuc {
    xepLoaiHocLuc hocLuc = new xepLoaiHocLuc();

    @Test
    public void testHocLuc(){
        String ketquMongMuon = "Giỏi";
        String ketQuaThucTe = hocLuc.hocLuc(8.5);
    }
}
