/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneyönelimli;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class SicaklikAlgilayici {
    private int Sicaklik = 0;
    private Random rnd = new Random();
    
    private int sicaklikOlustur(){
        Sicaklik = rnd.nextInt(100);
        return Sicaklik;
    }
    
    public int sicaklikOku(){
        return sicaklikOlustur();
    }
}
