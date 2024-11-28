import java.util.ArrayList;
import java.util.List;

public class Bandara implements PenumpangManagement, DaftarPenumpang {
    private ArrayList<Penerbangan> daftarPenerbangan;

    public Bandara() {
        this.daftarPenerbangan = new ArrayList<>();
    }

    public void tambahPenerbangan(Penerbangan penerbangan) {
        daftarPenerbangan.add(penerbangan);
    }

    @Override
    public void tambahPenumpang(Penumpang penumpang, Penerbangan penerbangan) {
        penerbangan.tambahPenumpang(penumpang);
    }

    @Override
    public void kurangiPenumpang(String nomorIdentitas, Penerbangan penerbangan) {
        penerbangan.hapusPenumpang(nomorIdentitas);
    }

    @Override
    public List<Penumpang> daftarPenumpang(String kotaTujuan, ArrayList<Penerbangan> penerbangan) {
        List<Penumpang> hasil = new ArrayList<>();
        for (Penerbangan p : penerbangan) {
            if (p.getKotaTujuan().equalsIgnoreCase(kotaTujuan)) {
                hasil.addAll(p.getDaftarPenumpang());
            }
        }
        return hasil;
    }

    public ArrayList<Penerbangan> getDaftarPenerbangan() {
        return daftarPenerbangan;
    }
}
