/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bandara;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ManajemenBandara {
    static ArrayList<Bandara> daftarPenerbangan = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== Sistem Manajemen Penerbangan ===");
            System.out.println("1. Tambah Penerbangan");
            System.out.println("2. Lihat Semua Penerbangan");
            System.out.println("3. Ubah Penerbangan");
            System.out.println("4. Hapus Penerbangan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahPenerbangan(scanner);
                    break;
                case 2:
                    lihatSemuaPenerbangan();
                    break;
                case 3:
                    ubahPenerbangan(scanner);
                    break;
                case 4:
                    hapusPenerbangan(scanner);
                    break;
                case 5:
                    berjalan = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }

    public static void tambahPenerbangan(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan Tujuan: ");
        String tujuan = scanner.nextLine();
        System.out.print("Masukkan Jadwal: ");
        String jadwal = scanner.nextLine();

        Bandara penerbanganBaru = new Bandara(kode, tujuan, jadwal);
        daftarPenerbangan.add(penerbanganBaru);
        System.out.println("Penerbangan berhasil ditambahkan.");
    }

    public static void lihatSemuaPenerbangan() {
        if (daftarPenerbangan.isEmpty()) {
            System.out.println("Tidak ada penerbangan yang tersedia.");
        } else {
            for (Bandara penerbangan : daftarPenerbangan) {
                penerbangan.tampilkanInfo();
                System.out.println("----------------------");
            }
        }
    }

    public static void ubahPenerbangan(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan yang ingin diubah: ");
        String kode = scanner.nextLine();

        for (Bandara penerbangan : daftarPenerbangan) {
            if (penerbangan.getKodePenerbangan().equalsIgnoreCase(kode)) {
                System.out.print("Masukkan Tujuan Baru: ");
                penerbangan.setTujuan(scanner.nextLine());
                System.out.print("Masukkan Jadwal Baru: ");
                penerbangan.setJadwal(scanner.nextLine());
                System.out.println("Penerbangan berhasil diubah.");
                return;
            }
        }
        System.out.println("Penerbangan tidak ditemukan.");
    }

    public static void hapusPenerbangan(Scanner scanner) {
        System.out.print("Masukkan Kode Penerbangan yang ingin dihapus: ");
        String kode = scanner.nextLine();

        for (Bandara penerbangan : daftarPenerbangan) {
            if (penerbangan.getKodePenerbangan().equalsIgnoreCase(kode)) {
                daftarPenerbangan.remove(penerbangan);
                System.out.println("Penerbangan berhasil dihapus.");
                return;
            }
        }
        System.out.println("Penerbangan tidak ditemukan.");
    }
}
