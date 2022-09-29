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
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
       // String modelInput;
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan Televisi dengan Input= " + ((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase Televisi= " + ((TelevisiJadul) perangkat).voltase);

        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan Televisi modern dengan input= " + ((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltase Televisi= " + ((TelevisiModern) perangkat).voltase);
        }
    }
}
