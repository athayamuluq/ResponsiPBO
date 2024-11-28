import java.util.ArrayList;
import java.util.List;

public interface DaftarPenumpang {
    List<Penumpang> daftarPenumpang(String kotaTujuan, ArrayList<Penerbangan> Penerbangan);
}
