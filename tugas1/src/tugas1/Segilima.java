/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Segilima extends BangunDatarSegi implements kelilingSL {
    
    float hasilRumus = 1.7205f; 
    
    public Segilima() {
        setjmlSisi(5);
        this.hasilRumus = hasilRumus;
    }

    @Override
    public double kelilingSegilima() {
        double kSegilima = panjangSisi*jmlSisi;
        return kSegilima;
    }
    
    
    
}
