package com.pbo.NathanaelAndraWijaya.pertemuan3.Unguided2;

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setNo_buku(1);
        buku1.setJudul_buku("Pemrograman Berbasis Objek dengan Java");
        buku1.setPengarang("Indrajani");
        buku1.setTahun_terbit(2007);
        buku1.setHarga(70000);

        Buku buku2 = new Buku();
        buku2.setNo_buku(2);
        buku2.setJudul_buku("Dasar Pemrograman Java");
        buku2.setPengarang("Abdul Kadir");
        buku2.setTahun_terbit(2004);
        buku2.setHarga(30000);

        System.out.println("Detail Buku:");
        System.out.println("Buku 1:");
        System.out.println("No. Buku: " + buku1.getNo_buku());
        System.out.println("Judul Buku: " + buku1.getJudul_buku());
        System.out.println("Pengarang: " + buku1.getPengarang());
        System.out.println("Tahun Terbit: " + buku1.getTahun_terbit());
        System.out.println("Harga: " + buku1.getHarga());

        System.out.println("Buku 2:");
        System.out.println("No. Buku: " + buku2.getNo_buku());
        System.out.println("Judul Buku: " + buku2.getJudul_buku());
        System.out.println("Pengarang: " + buku2.getPengarang());
        System.out.println("Tahun Terbit: " + buku2.getTahun_terbit());
        System.out.println("Harga: " + buku2.getHarga());

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor buku yang ingin dibeli: ");
        int nomor_buku = input.nextInt();
        System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
        int jumlah_buku = input.nextInt();
        if (nomor_buku == 1) {
            int total_harga = buku1.getHarga() * jumlah_buku;
            System.out.println("Total Harga: " + total_harga);
            bayar_buku(total_harga, buku1);
        } else if (nomor_buku == 2) {
            int total_harga = buku2.getHarga() * jumlah_buku;
            System.out.println("Total Harga: " + total_harga);
            bayar_buku(total_harga, buku2);
        } else {
            System.out.println("Nomor buku yang dimasukkan tidak tersedia");
        }
    }

    public static void bayar_buku(int total_harga, Buku buku) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bayar: ");
        int jumlah_bayar = input.nextInt();
        if (jumlah_bayar < total_harga) {
            System.out.println("Jumlah bayar kurang dari total harga");
        } else {
            int kembalian = jumlah_bayar - total_harga;
            System.out.println("Kembalian: " + kembalian);
            System.out.println("Detail Buku:");
            System.out.println("No. Buku: " + buku.getNo_buku());
            System.out.println("Judul Buku: " + buku.getJudul_buku());
            System.out.println("Pengarang: " + buku.getPengarang());
            System.out.println("Tahun Terbit: " + buku.getTahun_terbit());
            System.out.println("Harga: " + buku.getHarga());
            System.out.println("Jumlah Bayar: " + jumlah_bayar);
        }
    }
}
