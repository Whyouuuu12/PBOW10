/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugaspbow10;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Elektronik produkElektronik = new Elektronik();
        Makanan produkMakanan = new Makanan();

        // Harga produk contoh
        double hargaElektronik = 2000000; // harga dalam rupiah
        double hargaMakanan = 50000; // harga dalam rupiah

        // Menghitung pajak untuk Elektronik
        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        System.out.println("Pajak untuk produk Elektronik: Rp " + pajakElektronik);

        // Menghitung pajak untuk Makanan
        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);
        System.out.println("Pajak untuk produk Makanan: Rp " + pajakMakanan);
    }
}
