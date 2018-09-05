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
public class UjiPraktikum1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        manusia l = new Lakilaki(0);
        manusia p = new Perempuan(0);
        String Kelamin;
        
        System.out.println("User 1");
        System.out.print("Masukkan Tinggi Badan Anda (cm) : ");
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukkan Jenis Kelamin : ");
        Kelamin = masukan.next();
        switch(Kelamin){
            case "L":System.out.println("Berat Badan Pria Ideal Anda adalah : "+l.HtgBBI());
            break;
            case "P":System.out.println("Berat Badan Wanita Ideal Anda adalah : "+p.HtgBBI());
            break;
            case "l":System.out.println("Berat Badan Pria Ideal Anda adalah : "+l.HtgBBI());
            break;
            case "p":System.out.println("Berat Badan Wanita Ideal Anda adalah : "+p.HtgBBI());
            break;
        }
        
        System.out.print("\n");
        System.out.println("User 2");
        System.out.print("Masukkan Tinggi Badan Anda (cm) : ");
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukkan Jenis Kelamin : ");
        Kelamin = masukan.next();
        switch(Kelamin){
            case "L":System.out.println("Berat Badan Pria Ideal Anda adalah : "+l.HtgBBI());
            break;
            case "P":System.out.println("Berat Badan Wanita Ideal Anda adalah : "+p.HtgBBI());
            break;
            case "l":System.out.println("Berat Badan Pria Ideal Anda adalah : "+l.HtgBBI());
            break;
            case "p":System.out.println("Berat Badan Wanita Ideal Anda adalah : "+p.HtgBBI());
            break;
        }
    }
}
