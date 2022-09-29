/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Rajendra Rakha
 */
public class sepedaGunung extends sepeda{
    private String tipeSuspensi;
    
    public void setTipeSuspensi (String newValue){
        tipeSuspensi=newValue;
    }
    public void cetakStatus(){
        super.cetakStatue();
        System.out.println("Tipe Suspensi: "+tipeSuspensi);
    }
}
