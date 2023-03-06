/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatarSegi implements kelilingST {
    double alas, tinggi;
    String rumus;
    
    public Segitiga() {
        setjmlSisi(3);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double kelilingSegitiga() {
        double kSegitiga = panjangSisi*jmlSisi;
        return kSegitiga;
    }
    
}
