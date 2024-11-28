public interface PenumpangManagement {
    void tambahPenumpang(Penumpang penumpang, Penerbangan penerbangan);
    void kurangiPenumpang(String nomorIdentitas, Penerbangan penerbangan);
}
