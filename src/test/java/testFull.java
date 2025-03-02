import com.example.ktnc1.ArraySum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testFull {
    ArraySum arraySum = new ArraySum();
    @Test
public void testTong(){
    Assertions.assertEquals(11,arraySum.cong(5,6));
}
@Test
    public void arrSum(){
        int[] arr = {1,2,3};
        Assertions.assertEquals(6,arraySum.sum(arr));
}
@Test
    public void ngoaiLeArrSum(){
        int[] arr = {};
//        Assertions.assertEquals(0, arraySum.sum(arr));
    Assertions.assertThrows(IllegalArgumentException.class, () -> arraySum.sum(arr));
}
@Test
    public void chia(){
        Assertions.assertEquals(2,arraySum.chia(6,3));
}
@Test
    public void chiaNL(){
        Assertions.assertEquals(0,arraySum.chia(5,0));
    Assertions.assertThrows(IllegalArgumentException.class, () -> arraySum.chia(5,0));
}
@Test
    public void xepLoat(){
        Assertions.assertEquals("Giỏi",arraySum.xepLoai(9.5));
}
@Test
    public void xepLoaiNL(){
//        Assertions.assertEquals("Giỏi",arraySum.xepLoai(11));
    Assertions.assertThrows(IllegalArgumentException.class, () -> arraySum.xepLoai(11));
}
@Test
    public void findMax(){
        int arr[] = {1,-1,5,10};
        Assertions.assertEquals(10,arraySum.findMax(arr));
}
@Test
    public void findMaxNL(){
        int arr[] = {};
//        Assertions.assertEquals(10, arraySum.findMax(arr));
    Assertions.assertThrows(IllegalArgumentException.class, () -> arraySum.findMax(arr));
}
}
