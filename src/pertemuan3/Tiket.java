package pertemuan3;
import java.util.Scanner;

public class Tiket {
    private String namaPengguna;
    private String kataSandi;
    private int jumlahKamar;
    private double hargaKamar;
    private String namaMaskapai;
    private int jumlahPenumpang;
    private double hargaTiketPesawat;
    private String destinasi;

    public Tiket() {
        this.namaPengguna = null;
        this.kataSandi = null;
    }

    public void aturKredensial(String namaPengguna, String kataSandi) {
        this.namaPengguna = namaPengguna;
        this.kataSandi = kataSandi;
    }

    public boolean masuk(String namaPengguna, String kataSandi) {
        return this.namaPengguna.equals(namaPengguna) && this.kataSandi.equals(kataSandi);
    }

    public void masukkanDataTransaksi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah kamar: ");
        jumlahKamar = scanner.nextInt();

        System.out.print("Harga per kamar: ");
        hargaKamar = scanner.nextDouble();

        System.out.print("Nama maskapai: ");
        namaMaskapai = scanner.next();

        System.out.print("Jumlah penumpang: ");
        jumlahPenumpang = scanner.nextInt();

        System.out.print("Harga tiket pesawat: ");
        hargaTiketPesawat = scanner.nextDouble();

        System.out.print("Tujuan: ");
        destinasi = scanner.next();
    }

    public void lihatDataTiket() {
        if (jumlahKamar != 0) {
            double totalBiayaKamar = (hargaKamar * jumlahKamar) * 0.55; // Diskon 45%
            double hargaTiket = hargaTiketPesawat * jumlahPenumpang;
            double total = hargaTiket + (jumlahPenumpang * 29000); // Asuransi 29000/penumpang

            System.out.println("\n--- Data Tiket ---");
            System.out.println("Jumlah Kamar: " + jumlahKamar);
            System.out.println("Harga Kamar: " + hargaKamar);
            System.out.println("Nama Maskapai: " + namaMaskapai);
            System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
            System.out.println("Harga Tiket Pesawat: " + hargaTiketPesawat);
            System.out.println("Tujuan: " + destinasi);
            System.out.println("Total Biaya Kamar: " + totalBiayaKamar);
            System.out.println("Harga Tiket: " + hargaTiket);
            System.out.println("Total: " + total);
        } else {
            System.out.println("Belum ada data tiket.");
        }
    }
}
