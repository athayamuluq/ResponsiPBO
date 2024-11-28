public abstract class JenisKursi {
    private String namaKursi;

    public JenisKursi(String namaKursi) {
        this.namaKursi = namaKursi;
    }

    public String getNamaKursi() {
        return namaKursi;
    }

    @Override
    public String toString() {
        return "Jenis Kursi: " + namaKursi;
    }
}

// Subkelas Ekonomi
class Ekonomi extends JenisKursi {
    public Ekonomi() {
        super("Ekonomi");
    }
}

// Subkelas Ekonomi Premium
class EkonomiPremium extends JenisKursi {
    public EkonomiPremium() {
        super("Ekonomi Premium");
    }
}

// Subkelas Bisnis
class Bisnis extends JenisKursi {
    public Bisnis() {
        super("Bisnis");
    }
}

// Subkelas First Class
class FirstClass extends JenisKursi {
    public FirstClass() {
        super("First Class");
    }
}

// Subkelas Quiet Zone
class QuietZone extends JenisKursi {
    public QuietZone() {
        super("Quiet Zone");
    }
}
