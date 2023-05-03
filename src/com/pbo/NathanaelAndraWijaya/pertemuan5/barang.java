package com.pbo.NathanaelAndraWijaya.pertemuan5;

public class barang {
    String nama;
    int harga;

    public barang() {
    }

    public barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void showinfo() {
        System.out.println("Nama Barang : " + this.nama);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println();
    }
}
