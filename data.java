package ngoding;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        
       // Instansiasi objek Scanner dan disimpan ke variabel scan
        Scanner scanner = new Scanner(System.in);
        
       // Membaca input nama dari user
        String nama = scanner.nextLine();
       // Membaca input NIM dari user
        String nim = scanner.nextLine();
        // Membaca input angkatan dari user
        int angkatan = scanner.nextInt();
        // Menangani newline character setelah nextInt()
        scanner.nextLine();
        // Membaca input prodi angkatan dari user
        String prodi = scanner.nextLine();
        // Membaca input status angkatan dari user
        Boolean status = scanner.nextBoolean();
        // Membaca input IPK angkatan dari user
        double ipk = scanner.nextDouble();

        //mengeluarkan output yang telah di input
        System.out.println("== DATA MAHASISWA ==");
        // Menampilkan output Nama dengan nama user 
        System.out.println("Nama : " + nama);
        // Menampilkan output nomor NIM user
        System.out.println("NIM : " + nim);
        // Menampilkan output tahun angkatan user
        System.out.println("Angkatan : " + angkatan);
        // Menampilkan output prodi user
        System.out.println("Prodi : " + prodi);
        // Menampilkan output status mahasiswa true/false
        System.out.println("Mahasiswa Aktif : " + status);
        // Menampilkan output dengan format dua angka dibelakang koma pada IPK user
        System.out.printf("IPK : %.2f\n", ipk);
        
        // Menutup objek Scanner setelah selesai digunakan
        scanner.close();
    }
}
