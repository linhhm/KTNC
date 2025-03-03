import com.example.ktnc1.SinhVien;
import com.example.ktnc1.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TestSV {
    SinhVienService svsv = new SinhVienService();

    @Test
    public void testAdd(){
        SinhVien sv1 = new SinhVien(1,"linh");
        Assertions.assertEquals("them thanh cong",svsv.addSV(sv1));
    }

    @Test
    public void testSearch() {
        SinhVienService svsv = new SinhVienService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> svsv.searchNam(""));
    }

}
