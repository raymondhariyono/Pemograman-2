package Modul6;

import java.util.ArrayList;
import java.util.List;

public class DataMahasiswa {
    public static List<Mahasiswa> getMahasiswaList() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("2110817310005", "Van Persie"));
        mahasiswaList.add(new Mahasiswa("1910817110004", "Mikhailo Mudryk"));
        mahasiswaList.add(new Mahasiswa("2410817210012", "Christiano Ronaldo"));
        mahasiswaList.add(new Mahasiswa("1710817210008", "Zay Idjes"));
        mahasiswaList.add(new Mahasiswa("2210817210005", "Leonel Messi"));
        mahasiswaList.add(new Mahasiswa("2310817210007", "Boaz saloza"));
        mahasiswaList.add(new Mahasiswa("2410817110002", "Irfan Bachdim"));
        mahasiswaList.add(new Mahasiswa("2110817310001", "Ngolo Kante"));
        mahasiswaList.add(new Mahasiswa("2410817210023", "Indra safjri"));
        mahasiswaList.add(new Mahasiswa("2310817310015", "Shin Tae Young"));
        return mahasiswaList;
    }
}
