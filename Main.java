package StudiKasus02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean next = true;

        while (next) {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("masukkan alamat: ");
            String alamat = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);

            daftarMahasiswa.add(mahasiswa);

            System.out.print("tambah lagi? ");
            String tambah = scanner.nextLine();
            if (tambah.equals("t")) {
                next = false;
            }
        }
        System.out.println("==================================");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}