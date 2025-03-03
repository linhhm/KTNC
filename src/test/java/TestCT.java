import com.example.ktnc1.CongThuc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCT {
    CongThuc ct = new CongThuc();
    @Test
    public void testMang(){
        int[] arr = {1,2,3};
        int[] arr1 = {};
//        Assertions.assertEquals(6, ct.mang(arr));
        Assertions.assertThrows(IllegalArgumentException.class, () -> ct.mang(arr1));
    }

    @Test
    public void testFindMax(){
        int[] arr = {1,2,3,4,5};
        Assertions.assertEquals(5, ct.findMax(arr));
    }
}
