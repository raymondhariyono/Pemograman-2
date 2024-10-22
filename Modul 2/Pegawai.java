public class Pegawai {

    public String nama;
    //menggunakan string asal agar tidak terjadi error karena inputan lebih dari satu kata
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
    return nama;
    }
    public String getAsal() {
    return asal;
    }
    //Program akan menagalami error karena tidak ada parameter pada method setJabatan
    //public void setJabatan() {
    public void setJabatan(String j) {
    this.jabatan = j;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
}