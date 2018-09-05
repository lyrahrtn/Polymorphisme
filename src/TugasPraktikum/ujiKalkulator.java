/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author SMK TELKOM
 */
public class ujiKalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("   Masukkan Bilangan ");
        System.out.println("------------------------");
        System.out.print("Masukkan angka Pertama : ");
        double bil1 = scan.nextDouble();
        
        System.out.print("Masukkan angka Kedua  : ");
        double bil2 = scan.nextDouble();
        
        kalkulator calc = new kalkulator(bil1, bil2);
        
        System.out.println("Hasil Penjumlahan : "+calc.penjumlahan());
        System.out.println("Hasil Pengurangan : "+calc.pengurangan());
        System.out.println("Hasil Perkalian   : "+calc.perkalian());
        System.out.println("Hasil Pembagian   : "+calc.pembagian());
        
        
    }
}
