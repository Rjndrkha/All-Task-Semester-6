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
public class JenisElektro extends Elektronik{
    String nama;
    int harga;
    
    public JenisElektro(String nm,int hrg){
        this.nama=nm;
        this.harga=hrg;
    }

  @Override
  public String getnama() {
        return "Melihat "+nama;

    }
  @Override
    public String getharga() {
        return "" + harga;

    }
    public void infoElek(){
        System.out.println(getnama() +" Dengan Harga Rp"+getharga());
    }
    
}
