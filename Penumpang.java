public class Penumpang {
    private String nama;
    private String nomorIdentitas;
    private String kotaKeberangkatan;
    private String kotaTujuan;
    private String maskapai;
    private String jenisKursi;

    public Penumpang(String nama, String nomorIdentitas, String kotaKeberangkatan,
                     String kotaTujuan, String maskapai, String jenisKursi) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.kotaKeberangkatan = kotaKeberangkatan;
        this.kotaTujuan = kotaTujuan;
        this.maskapai = maskapai;
        this.jenisKursi = jenisKursi;
    }

    // Getter dan Setter
    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", ID: " + nomorIdentitas + ", Maskapai: " + maskapai +
               ", Jenis Kursi: " + jenisKursi + ", Kota Tujuan: " + kotaTujuan;
    }
}
