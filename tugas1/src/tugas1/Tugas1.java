/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        
        selamat s = new selamatDatang();
        
        Segitiga KST = new Segitiga();
        Segiempat KSE = new Segiempat();
        Segilima KSL = new Segilima();
        
        s.getGreeting();
        
        System.out.print("masukan panjang sisi Segitiga : ");
        KST.panjangSisi = scn.nextDouble();
        System.out.println("Keliling Segitiga = " + KST.kelilingSegitiga());
        
        
        System.out.print("masukan panjang sisi Segiempat : ");
        KSE.panjangSisi = scn.nextDouble();
        System.out.println("Keliling Segiempat = " + KSE.kelilingSegiempat());
        
        System.out.print("masukan panjang sisi Segilima : ");
        KSL.panjangSisi = scn.nextDouble();
        System.out.println("Keliling Segiempat = " + KSL.kelilingSegilima());
    }
    
}
