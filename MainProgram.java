import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bandara bandara = new Bandara();

        while (true) {
            System.out.println("\n1. Tambah Maskapai dan Tujuan");
            System.out.println("2. Tambah Penumpang");
            System.out.println("3. Hapus Penumpang");
            System.out.println("4. Cari Penumpang Berdasarkan Kota Tujuan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (pilihan == 1) {
                TambahPenerbangan.tambahPenerbangan(bandara);
            } else if (pilihan == 2) {
                // Tambah penumpang
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Nomor Identitas: ");
                String nomorIdentitas = scanner.nextLine();
                System.out.print("Kota Keberangkatan: ");
                String kotaKeberangkatan = scanner.nextLine();
                System.out.print("Kota Tujuan: ");
                String kotaTujuan = scanner.nextLine();
                System.out.print("Maskapai: ");
                String maskapai = scanner.nextLine();
                System.out.print("Jenis Kursi (1: Ekonomi, 2: Bisnis, 3: First Class): ");
                int jenisKursiInput = scanner.nextInt();
                String jenisKursi = switch (jenisKursiInput) {
                    case 1 -> "Ekonomi";
                    case 2 -> "Bisnis";
                    case 3 -> "First Class";
                    default -> null;
                };

                if (jenisKursi == null) {
                    System.out.println("Jenis kursi tidak valid!");
                    continue;
                }

                // Validasi penerbangan
                Penerbangan penerbanganTerpilih = null;
                for (Penerbangan p : bandara.getDaftarPenerbangan()) {
                    if (p.getMaskapai().equalsIgnoreCase(maskapai) &&
                        p.getKotaTujuan().equalsIgnoreCase(kotaTujuan)) {
                        penerbanganTerpilih = p;
                        break;
                    }
                }

                if (penerbanganTerpilih == null) {
                    System.out.println("Penerbangan tidak tersedia!");
                } else {
                    Penumpang penumpang = new Penumpang(nama, nomorIdentitas, kotaKeberangkatan, kotaTujuan, maskapai, jenisKursi);
                    bandara.tambahPenumpang(penumpang, penerbanganTerpilih);
                    System.out.println("Penumpang berhasil ditambahkan!");
                }
            } else if (pilihan == 3) {
                // Hapus penumpang
                System.out.print("Masukkan Nomor Identitas: ");
                String nomorIdentitas = scanner.nextLine();
                for (Penerbangan p : bandara.getDaftarPenerbangan()) {
                    p.hapusPenumpang(nomorIdentitas);
                }
                System.out.println("Penumpang berhasil dihapus (jika ada)!");
            } else if (pilihan == 4) {
                // Cari daftar penumpang
                System.out.print("Masukkan Kota Tujuan: ");
                String kotaTujuan = scanner.nextLine();
                var hasil = bandara.daftarPenumpang(kotaTujuan, bandara.getDaftarPenerbangan());
                if (hasil.isEmpty()) {
                    System.out.println("Tidak ada penumpang ke kota tersebut!");
                } else {
                    System.out.println("Daftar Penumpang ke " + kotaTujuan + ":");
                    for (Penumpang penumpang : hasil) {
                        System.out.println(penumpang);
                    }
                }
            } else if (pilihan == 5) {
                System.out.println("Program selesai!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
