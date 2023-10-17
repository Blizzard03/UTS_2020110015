/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2020110015.UTS_2020110015.Rokok_Class;

/**
 *
 * @author mariq
 */
public class Rokok {
     private String merk;
    private double harga;
    private int jumlah;

    public Rokok(String merk, double harga, int jumlah) {
        this.merk = merk;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return harga * jumlah;
    }

    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}
