package Latihan;

import Latihan.Barang;

public class demoThrow {

    public static void main(String[] args) {
        Barang obj = new Barang();
        obj.setKode("123");
        obj.setNama("Bottle");
        obj.setHarga(10000);
        System.out.println("Kode   : " + obj.getKode());
        System.out.println("Nama   : " + obj.getNama());
        System.out.println("Harga  : " + obj.getHarga());
    }
}
