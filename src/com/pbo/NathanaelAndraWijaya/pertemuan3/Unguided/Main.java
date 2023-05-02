package com.pbo.NathanaelAndraWijaya.pertemuan3.Unguided;

class Main {
    public static void main(String[] args) {
        Koperasi bukuTulis = new Koperasi();
        bukuTulis.setNamaBarang("Buku Tulis");
        bukuTulis.setHargaBarang(5000);
        bukuTulis.setJumlahBarang(10);

        Koperasi pensil = new Koperasi();
        pensil.setNamaBarang("Pensil");
        pensil.setHargaBarang(3000);
        pensil.setJumlahBarang(20);

        bukuTulis.tampilBarang();
        System.out.println("Total harga Buku Tulis: " + bukuTulis.hitungTotal());

        System.out.println();

        pensil.tampilBarang();
        System.out.println("Total harga Pensil: " + pensil.hitungTotal());

        System.out.println();

        System.out.println("Total harga semua barang: " + (bukuTulis.hitungTotal() + pensil.hitungTotal()));
    }
}
