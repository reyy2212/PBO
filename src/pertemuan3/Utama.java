package pertemuan3;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tiket tiket = new Tiket();

        System.out.print("Masukkan nama pengguna: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan kata sandi: ");
        String password = scanner.nextLine();

        tiket.aturKredensial(username, password);

        System.out.println("=== Program Transaksi Tiket Pesawat dan Hotel ===");

        if (tiket.masuk(username, password)) {
            int pilihan = 0;

            while (pilihan != 3) {
                System.out.println("\nMenu:");
                System.out.println("1. Masukkan Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");

                System.out.print("Masukkan pilihan: ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        tiket.masukkanDataTransaksi();
                        break;
                    case 2:
                        tiket.lihatDataTiket();
                        break;
                    case 3:
                        System.out.println("Terima kasih. Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } else {
            System.out.println("Login gagal. Silakan coba lagi.");
        }
    }
}
