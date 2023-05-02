package com.pbo.NathanaelAndraWijaya.pertemuan4;

public class main {
    public static void main(String[] args) {
        manager manajer = new manager();
        pegawai pegaway = new pegawai();
        manajer.nip = 21102201;
        manajer.nama = "Nathanael Andra Wijaya";
        pegaway.nip = 21102299;
        pegaway.nama = "Denisa Ajeng Sabrina";

        manajer.showInfo();
        manajer.extrainfo();
        manajer.bonus(99999);

        pegaway.showInfo();
        pegaway.extrainfo();
    }
}
