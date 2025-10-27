# 📚 Sistem Manajemen Data Mahasiswa (Java)

Program sederhana berbasis **Java Console** untuk mengelola data mahasiswa dengan fitur:
- Menambah data mahasiswa
- Menampilkan daftar mahasiswa
- Menghapus data mahasiswa berdasarkan NIM

---
# 👨‍💻 PEMBUAT

Nama: Maulvi Raia

NIM: 202410370110254

Kelas: Informatika

---

Mata Kuliah: Pemrograman Lanjut
---
## 🧩 Struktur Program

### 🔹 Kelas `Mahasiswa`
Kelas ini merepresentasikan entitas mahasiswa dalam sistem.  
Berisi atribut:
- `name` → Nama mahasiswa
- `nim` → Nomor Induk Mahasiswa
- `jurusan` → Jurusan atau program studi mahasiswa

Selain itu, kelas ini memiliki:
- **Konstruktor** untuk inisialisasi objek mahasiswa.
- **Getter dan Setter** untuk setiap atribut (menerapkan *encapsulation*).
- **Method `toString()`** untuk menampilkan data mahasiswa dalam format rapi.
---

### 🔹 Kelas `Main`

Kelas utama yang menjalankan program interaktif di console.
Berfungsi untuk menampilkan menu dan mengelola daftar mahasiswa menggunakan ArrayList<Mahasiswa>.

Fungsi utama di dalamnya:

- **showMenu()**	Menampilkan pilihan menu ke pengguna
- **tambahData()**	Menerima input dari pengguna dan menambahkan data mahasiswa baru ke list
- **lihatData()**	Menampilkan semua data mahasiswa yang tersimpan
- **hapusData()**	Menghapus data mahasiswa berdasarkan NIM yang dimasukkan pengguna
- **main()**	Fungsi utama yang menjalankan seluruh alur program

---
## ⚙️ Cara Menjalankan

1. Pastikan sudah menginstall **Java 8+**
2. Kompilasi file:
   ```bash
   java Main.java
---

# Contoh Output
``` bash
    === Menu Mahasiswa ===
    1. Tambah Data
    2. Lihat Data
    3. Hapus Data
    4. Keluar
    Pilih: 1
    Nama: maulvi
    NIM: 202410370110254
    Jurusan: Informatika
    Data berhasil ditambah
