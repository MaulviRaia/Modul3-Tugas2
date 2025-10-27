package org.example;

import java.util.*;

/**
 * Kelas {@code Main} berfungsi sebagai program utama
 * untuk mengelola data mahasiswa menggunakan menu interaktif.
 *
 * <p>Program ini memiliki tiga fitur utama:</p>
 * <ul>
 *   <li>Menambah data mahasiswa</li>
 *   <li>Melihat daftar mahasiswa</li>
 *   <li>Menghapus data mahasiswa berdasarkan NIM</li>
 * </ul>
 *
 * <p>Data disimpan dalam struktur {@link java.util.ArrayList}.</p>
 *
 * @author Maulvi
 * @version 1.0
 * @since 2025-10
 */
public class Main {

    /** Pemisah antar data dalam tampilan */
    private static final String SEPARATOR = "--------------------";

    /**
     * Metode utama yang menjalankan menu interaktif untuk input pengguna.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while (true) {
            showMenu();
            int pilih;
            try {
                System.out.print("Pilih: ");
                pilih = Integer.parseInt(scannerInput.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                continue;
            }

            switch (pilih) {
                case 1 -> tambahData(scannerInput, daftarMahasiswa);
                case 2 -> lihatData(daftarMahasiswa);
                case 3 -> hapusData(scannerInput, daftarMahasiswa);
                case 4 -> {
                    System.out.println("Keluar...");
                    scannerInput.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    /**
     * Menampilkan menu utama ke layar.
     */
    private static void showMenu() {
        System.out.println("\n=== Menu Mahasiswa ===");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Keluar");
    }

    /**
     * Menambahkan data mahasiswa baru ke dalam daftar.
     *
     * @param scanner objek {@link Scanner} untuk menerima input pengguna
     * @param daftar list mahasiswa tempat data akan ditambahkan
     */
    private static void tambahData(Scanner scanner, List<Mahasiswa> daftar) {
        System.out.print("Nama: ");
        String n = scanner.nextLine();
        System.out.print("NIM: ");
        String ni = scanner.nextLine();
        System.out.print("Jurusan: ");
        String j = scanner.nextLine();

        daftar.add(new Mahasiswa(n, ni, j));
        System.out.println("Data berhasil ditambah!");
    }

    /**
     * Menampilkan semua data mahasiswa di dalam daftar.
     *
     * @param daftar list mahasiswa yang ingin ditampilkan
     */
    private static void lihatData(List<Mahasiswa> daftar) {
        System.out.println("\n=== Data Mahasiswa ===");
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        for (Mahasiswa m : daftar) {
            System.out.println(m.toString());
            System.out.println(SEPARATOR);
        }
    }

    /**
     * Menghapus data mahasiswa berdasarkan NIM.
     *
     * @param scanner objek {@link Scanner} untuk menerima input pengguna
     * @param daftar list mahasiswa yang akan dihapus datanya
     */
    private static void hapusData(Scanner scanner, List<Mahasiswa> daftar) {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nimHapus = scanner.nextLine();
        boolean ketemu = false;

        Iterator<Mahasiswa> it = daftar.iterator();
        while (it.hasNext()) {
            Mahasiswa m = it.next();
            if (m.getNim().equals(nimHapus)) {
                it.remove();
                ketemu = true;
                System.out.println("Data berhasil dihapus!");
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan!");
        }
    }
}
