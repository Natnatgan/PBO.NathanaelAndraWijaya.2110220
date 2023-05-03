package com.pbo.NathanaelAndraWijaya.pertemuan5;

public class main {
    public static void main(String[] args) {
        barang[] keranjang = new barang[10];

        barang[] etalase = {
                new barang("Indomie", 2000 ),
                new barang("mie sedap", 2000),
                new barang("beras", 12000),
                new barang("gula", 15000),
        };
        System.out.println("Bayak Barang di Etalase : " + etalase.length);

//        int i = 1;
//        for ( barang barang : etalase) {
//            System.out.println("Barang ke-"+i);
//            barang.showinfo();
//            i++;
//        }

        for(int j=0; j<etalase.length; j++) {
            System.out.println("Barang ke-" + (j+1));
            etalase[j].showinfo();
        }

        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang : ");
        keranjang[0].showinfo();
    }
}
