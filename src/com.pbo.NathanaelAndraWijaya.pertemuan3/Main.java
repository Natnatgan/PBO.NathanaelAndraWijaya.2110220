package com.pbo.NathanaelAndraWijaya.pertemuan3;

public class Main {
    public static void main(String[] args) {
        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor yahaha = new SepedaMotor();
        SepedaMotor hando = new SepedaMotor();

//        suzuki.merek = "Suzuki";
//        suzuki.tipe = "GSX 150 R";
//        suzuki.harga = 20000000;
//
//        yahaha.merek = "Yahaha";
//        yahaha.tipe = "Y2F R15";
//        yahaha.harga = 25000000;
//
//        hando.merek = "Hando";
//        hando.tipe = "CBR 150R";
//        hando.harga = 23500000;
//
//        suzuki.showInfo();
//        yahaha.showInfo();
//        hando.showInfo();

        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 40000000 );

//        vespa.showInfo();

        System.out.println(
                "Merek : " + vespa.getMerek() +
                "Tipe :  (Before) : " + vespa.getTipe()
        );

        vespa.setTipe("Sprint");

        System.out.println(
                "Merek : " + vespa.getTipe() +
                "Tipe (After) : " + vespa.getTipe()
        );

    }
}
