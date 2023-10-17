/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_2020110015.UTS_2020110015.Main_Class;

import uts_2020110015.UTS_2020110015.Invoice.Faktur;
import uts_2020110015.UTS_2020110015.Rokok.Djarum_Black_Class.Djarum_Black;
import uts_2020110015.UTS_2020110015.Rokok.LA_Purple_Boost_Class.LA_Purple_Boost;
import uts_2020110015.UTS_2020110015.Rokok.Sampoerna_Mild_Class.Sampoerna_Mild;

/**
 *
 * @author mariq
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Faktur
        Faktur faktur = new Faktur();

        // Menambahkan rokok-rokok ke faktur
        //Sampoerna
        faktur.tambahRokok(new Sampoerna_Mild("Sampoerna Mild Biasa", 24000, 2, "Filter Gold"));
        faktur.tambahRokok(new Sampoerna_Mild("Sampoerna Mild Splash Stawberry", 25000, 2, "Filter Gold"));
        faktur.tambahRokok(new Sampoerna_Mild("Sampoerna Mild Splash Lemon", 25000, 2, "Filter Gold"));
        faktur.tambahRokok(new Sampoerna_Mild("Sampoerna Mild Splash Mentol", 25000, 2, "Filter Gold"));
        
        //Djarum
        faktur.tambahRokok(new Djarum_Black("Djarum Super", 25000, 3, 20));
        faktur.tambahRokok(new Djarum_Black("Djarum Coklat", 18000, 3, 20));
        faktur.tambahRokok(new Djarum_Black("Djarum Black Biasa", 30000, 3, 20));
        faktur.tambahRokok(new Djarum_Black("Djarum Black Cappucino", 30000, 3, 20));

        //LA
        faktur.tambahRokok(new LA_Purple_Boost("LA Purple Boost", 30000, 1, "Vitamin C"));
        faktur.tambahRokok(new LA_Purple_Boost("LA Bold", 37000, 1, "Vitamin C"));
        faktur.tambahRokok(new LA_Purple_Boost("LA Mild", 30000, 1, "Vitamin C"));

        // Mencetak faktur
        faktur.cetakFaktur();
    }

}
