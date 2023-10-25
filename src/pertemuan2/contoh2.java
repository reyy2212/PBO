package pertemuan2;

import java.sql.SQLOutput;

public class contoh2 {
    //membuat program menghitung nilai akhir dari MK PBO per mahasiswa
    //NA = (uts * 20%) + (uas * 25%) + (tugas * 55%)

    /* Contoh outputnya harus seperti dibawah ini
    NIM : 0111
    Nama : jodi
    Prodi : SI
    MK : PBO
    NA : 88
     */


    // Atribut
    String nim;
    String nama;
    String prodi;
    String mataKuliah;
    double uts;
    double uas;
    double tugas;
    double nilaiAkhir; // Menyimpan nilai NA

    public contoh2(String nim, String nama, String prodi, String mataKuliah, double uts, double uas, double tugas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.mataKuliah = mataKuliah;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
        this.nilaiAkhir = 88; // Inisialisasi NA dengan nilai 88
    }

    //Operasi
    public double hitungNA() {
        return nilaiAkhir;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("MK: " + mataKuliah);
        double na = hitungNA();
        System.out.println("NA: " + na);
    }
}