/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2020110015.UTS_2020110015.Rokok.Sampoerna_Mild_Class;

import uts_2020110015.UTS_2020110015.Rokok_Class.Rokok;

/**
 *
 * @author mariq
 */
public class Sampoerna_Mild extends Rokok{
    
    private String jenisFilter;

    public Sampoerna_Mild(String merk, double harga, int jumlah, String jenisFilter) {
        super(merk, harga, jumlah);
        this.jenisFilter = jenisFilter;
    }

    public String getJenisFilter() {
        return jenisFilter;
    }
    
}
