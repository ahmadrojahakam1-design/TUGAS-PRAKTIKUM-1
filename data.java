package ngoding;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.nextLine();
        String nim = scanner.nextLine();
        int angkatan = scanner.nextInt();
        scanner.nextLine();
        String prodi = scanner.nextLine();
        Boolean status = scanner.nextBoolean();
        double ipk = scanner.nextDouble();
        
        System.out.println("== DATA MAHASISWA ==");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mahasiswa Aktif : " + status);
        System.out.printf("IPK : %.2f\n", ipk);
        
        scanner.close();
    }
}