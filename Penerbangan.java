import java.util.ArrayList;

public class Penerbangan {
    private String kodePenerbangan;
    private String maskapai;
    private String kotaTujuan;
    private ArrayList<Penumpang> daftarPenumpang;

    public Penerbangan(String kodePenerbangan, String maskapai, String kotaTujuan) {
        this.kodePenerbangan = kodePenerbangan;
        this.maskapai = maskapai;
        this.kotaTujuan = kotaTujuan;
        this.daftarPenumpang = new ArrayList<>();
    }

    // Getter dan Setter
    public String getMaskapai() {
        return maskapai;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public ArrayList<Penumpang> getDaftarPenumpang() {
        return daftarPenumpang;
    }

    public void tambahPenumpang(Penumpang penumpang) {
        daftarPenumpang.add(penumpang);
    }

    public void hapusPenumpang(String nomorIdentitas) {
        daftarPenumpang.removeIf(p -> p.getNomorIdentitas().equals(nomorIdentitas));
    }
}
