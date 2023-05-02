package modul2;

import java.util.Scanner;
public class unguided2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, programStudi;
        int umur;

        System.out.println("=== Form Pendaftaran Mahasiswa ===");

        System.out.print("Masukkan nama lengkap: ");
        nama = input.nextLine();

        if (nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong");
            return;
        }

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();
        input.nextLine();

        if (umur < 18 ) {
            System.out.println("Umur harus 18 tahun keatas");
            return;
        }

        System.out.println("Pilih program studi: ");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Teknik Jaringan");
        System.out.print("Masukan Pilihan anda : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            programStudi = "Teknik Informatika";
        } else if (pilihan == 2) {
            programStudi = "Sistem Informasi";
        } else if (pilihan == 3) {
            programStudi = "Teknik Jaringan";
        } else {
            System.out.println("Pilihan program studi tidak valid!");
            return;
        }

        System.out.println("\n=== Data Pendaftaran Mahasiswa ===");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Program Studi: " + programStudi);
    }
}
