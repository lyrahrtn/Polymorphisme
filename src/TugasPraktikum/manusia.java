/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author SMK TELKOM
 */
public abstract class manusia {
    public double TinggiBadan;
    
    public manusia(double TB){
        TinggiBadan = TB;
    }
    public double getter(){
        return TinggiBadan;
    }
    public abstract double HtgBBI();
}
