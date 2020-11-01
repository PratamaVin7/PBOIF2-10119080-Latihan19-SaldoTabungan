/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Saldo Tabungan
 */
public class PBOIF210119080Latihan19SaldoTabungan {

    public static int saldo, lama = 6;
    public static Double bunga, totalbunga;
    
    public static double hitungbunga(double bunga, int saldo) {
        totalbunga = bunga * saldo;
        return totalbunga;
    }
    
    public static void tampilsaldo(double bunga, int saldo) {
        for (int i = 1; i <= lama; i++) {
            saldo += hitungbunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+i+" Rp.%,d%n", saldo);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tampilsaldo(0.15, 2500000);
    }
    
}