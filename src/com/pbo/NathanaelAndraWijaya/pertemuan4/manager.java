package com.pbo.NathanaelAndraWijaya.pertemuan4;

public class manager extends pegawai {
    public void bonus (int bonus) {
        System.out.println("Pegawai dengan nama : "+ nama + " Dengan NIP : "+ nip + " mendapatkan Bonus : "+ bonus);
    }
    public void extrainfo () {
        System.out.println("Jabatan Pegawai Manager");
    }
    public void bonus(){
        System.out.println("Harap Masukan jenis bonusnya");
    }
}
