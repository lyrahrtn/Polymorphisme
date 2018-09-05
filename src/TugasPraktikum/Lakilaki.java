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
public class Lakilaki extends manusia{
    public Lakilaki(double TB){
        super(TB);
    }
    @Override
    public double HtgBBI(){
        return(super.getter()-100)-((getter()-100)*10/100);
    }
}
