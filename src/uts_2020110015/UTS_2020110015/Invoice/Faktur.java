/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2020110015.UTS_2020110015.Invoice;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import uts_2020110015.UTS_2020110015.Rokok_Class.Rokok;

/**
 *
 * @author mariq
 */
public class Faktur {

    double totalHarga = 0;

    //Curency Formatter
    Locale Indonesia = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
    private final List<Rokok> rokokList = new ArrayList<>();

    public void tambahRokok(Rokok rokok) {
        rokokList.add(rokok);
    }

    public double hitungTotalHarga() {

        for (Rokok rokok : rokokList) {
            totalHarga += rokok.getTotalHarga();
        }
        return totalHarga;
    }

    public String addcurrency() {
        return formater.format(hitungTotalHarga());

    }

    public void cetakFaktur() {
        System.out.println("=== FAKTUR PENJUALAN ===");
        System.out.println("No. Faktur: " + generateNomorFaktur());
        System.out.println("Tanggal: " + getCurrentDate());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Merk Rokok");
        System.out.println("Harga\t\t Jumlah\t\t Total Harga");
        System.out.println("-----------------------------------------------------------");

        for (Rokok rokok : rokokList) {
            System.out.println(rokok.getMerk());
            System.out.println(formater.format(rokok.getHarga()) + "\t\t"
                    + rokok.getJumlah() + "\t"
                    + formater.format(rokok.getTotalHarga()));
            System.out.println(" ");
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Total Harga: " + addcurrency());
        System.out.println("Terima kasih atas pembelian Anda!");
    }

    private String generateNomorFaktur() {
        // Implementasi pembuatan nomor faktur dapat disesuaikan
        return "20231013-001";
    }

    private String getCurrentDate() {
        // Implementasi pengambilan tanggal sekarang dapat disesuaikan
        return "13 Oktober 2023";
    }

}
