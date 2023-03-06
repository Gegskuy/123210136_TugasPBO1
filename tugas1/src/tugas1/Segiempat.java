/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Segiempat extends BangunDatarSegi implements kelilingSE {
    
    public Segiempat() {
        setjmlSisi(4);
    }

   @Override
    public double kelilingSegiempat() {
        double kSegiempat = panjangSisi*jmlSisi;
        return kSegiempat;
    }

}
