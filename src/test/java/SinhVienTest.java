import com.example.ktnc1.SinhVien;
import com.example.ktnc1.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienTest {
    SinhVienService  svsv = new SinhVienService();
    @Test
    public void testAdd(){
        SinhVien sv1 = new SinhVien("1",18,9,5,"ABC","CNTT");
        svsv.addSV(sv1);
        Assertions.assertEquals("them thanh cong",svsv.addSV(sv1));
    }

    @Test
    public void nullAndTrong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> svsv.search(""));
    }
}
