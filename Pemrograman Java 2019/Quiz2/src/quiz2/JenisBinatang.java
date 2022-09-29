/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Rajendra Rakha
 */
public class JenisBinatang extends Binatang{

    String nama;
    int harga;

    public JenisBinatang(String nama, int hrg) {
        this.nama = nama;
        this.harga = hrg;
    }

    @Override
    public String getnama() {
        return "Melihat " + nama;

    }

    @Override
    public String getharga() {
        return "" + harga;

    }
    public void infoBina(){
        System.out.println( getnama() + " Dengan Harga Rp"+getharga());
    }

}
