import java.util.Scanner;

public class TambahPenerbangan {
    public static void tambahPenerbangan(Bandara bandara) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kode Penerbangan: ");
        String kodePenerbangan = scanner.nextLine();
        System.out.print("Masukkan Nama Maskapai: ");
        String maskapai = scanner.nextLine();
        System.out.print("Masukkan Kota Tujuan: ");
        String kotaTujuan = scanner.nextLine();

        // Buat objek penerbangan baru
        Penerbangan penerbanganBaru = new Penerbangan(kodePenerbangan, maskapai, kotaTujuan);
        bandara.tambahPenerbangan(penerbanganBaru);

        System.out.println("Penerbangan baru berhasil ditambahkan!");
    }
}
