/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2020110015.UTS_2020110015.Rokok.Djarum_Black_Class;

import uts_2020110015.UTS_2020110015.Rokok_Class.Rokok;

/**
 *
 * @author mariq
 */
public class Djarum_Black extends Rokok {

    private int nikotin;

    public Djarum_Black(String merk, double harga, int jumlah, int nikotin) {
        super(merk, harga, jumlah);
        this.nikotin = nikotin;
    }

    public int getNikotin() {
        return nikotin;
    }
}
