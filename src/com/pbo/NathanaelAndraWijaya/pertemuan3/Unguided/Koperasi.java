package com.pbo.NathanaelAndraWijaya.pertemuan3.Unguided;

class Koperasi {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int hitungTotal() {
        return hargaBarang * jumlahBarang;
    }

    public void tampilBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
    }
}
