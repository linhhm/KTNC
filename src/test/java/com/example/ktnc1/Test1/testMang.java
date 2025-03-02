package com.example.ktnc1.Test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testMang {
    mang m = new mang();
    @Test
    void testEmptyArray() {
        int[] array = {1, 2, 3, 4, 5};
        Assertions.assertEquals(15, m.calculateSum(array), "Tổng của {1,2,3,4,5} phải là 15");
    }
}
