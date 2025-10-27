package org.example;

/**
 * Kelas {@code Mahasiswa} yang merepresentasikan data mahasiswa
 * meliputi atas atribut nama, NIM, dan jurusan.
 *
 * <p>Kelas ini menggunakan prinsip <b>enkapsulasi</b> dengan atribut bersifat privat,
 * serta menyediakan method <i>getter</i> dan <i>setter</i> untuk mengakses dan memodifikasi data.</p>
 *
 * <p>Contoh penggunaan:</p>
 * <pre>{@code
 * Mahasiswa mhs = new Mahasiswa("Maulvi", "202410370110254", "Informatika");
 * System.out.println(mhs.getName());
 * }</pre>
 *
 * @author Maulvi
 * @version 1.0
 * @since 2025-10
 */
public class Mahasiswa {

    /** Nama mahasiswa */
    private String name;

    /** Nomor Induk Mahasiswa */
    private String nim;

    /** Jurusan mahasiswa */
    private String jurusan;

    /**
     * Membuat objek {@code Mahasiswa} baru dengan nama, NIM, dan jurusan.
     *
     * @param name nama mahasiswa
     * @param nim nomor induk mahasiswa
     * @param jurusan jurusan mahasiswa
     */
    public Mahasiswa(String name, String nim, String jurusan) {
        this.name = name;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    /**
     * Mengambil nama mahasiswa.
     *
     * @return nama mahasiswa
     */
    public String getName() {
        return name;
    }

    /**
     * Mengatur nama mahasiswa.
     *
     * @param name nama baru mahasiswa
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mengambil NIM mahasiswa.
     *
     * @return NIM mahasiswa
     */
    public String getNim() {
        return nim;
    }

    /**
     * Mengatur NIM mahasiswa.
     *
     * @param nim NIM baru mahasiswa
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * Mengambil jurusan mahasiswa.
     *
     * @return jurusan mahasiswa
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * Mengatur jurusan mahasiswa.
     *
     * @param jurusan jurusan baru mahasiswa
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * Mengembalikan representasi teks dari objek mahasiswa.
     *
     * @return string berisi nama, NIM, dan jurusan mahasiswa
     */
    @Override
    public String toString() {
        return "Nama: " + name + "\n" +
                "NIM: " + nim + "\n" +
                "Jurusan: " + jurusan;
    }
}
