/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2020110015.UTS_2020110015.Rokok.LA_Purple_Boost_Class;

import uts_2020110015.UTS_2020110015.Rokok_Class.Rokok;

/**
 *
 * @author mariq
 */
public class LA_Purple_Boost extends Rokok {

    private String kandunganTambahan;

    public LA_Purple_Boost(String merk, double harga, int jumlah, String kandunganTambahan) {
        super(merk, harga, jumlah);
        this.kandunganTambahan = kandunganTambahan;
    }

    public String getKandunganTambahan() {
        return kandunganTambahan;
    }
}
