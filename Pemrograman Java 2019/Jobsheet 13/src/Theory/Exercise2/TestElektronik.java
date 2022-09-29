/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory.Exercise2;

/**
 *
 * @author Rajendra Rakha
 */
public class TestElektronik {
    public static void main(String[] args) {
        
        Manusia mn=new Manusia();
        TelevisiJadul tvj=new TelevisiJadul();
        TelevisiModern tvm=new TelevisiModern();
        
        mn.nyalakanPerangkat(tvj);
        mn.nyalakanPerangkat(tvm);
        
    }
}
