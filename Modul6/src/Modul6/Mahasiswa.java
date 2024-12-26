package Modul6;

public class Mahasiswa {
    private String NIM;
    private String nama;

    // Constructor
    public Mahasiswa(String NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    // Getter and Setter
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
