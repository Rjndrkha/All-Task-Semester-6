/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum3;

/**
 *
 * @author Rajendra Rakha
 */
class Bangun {

    protected double phi;
    protected int r;

}

class Tabung extends Bangun {

    protected int t;

    public void setSuperPhi(double phi) {
        super.phi = phi;

    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        System.out.println("Volume tabung adalah : "
                + (super.phi * super.r * super.r * this.t));
    }
}

public class Practicum3 {

    public static void main(String[] args) {
        Tabung tabung = new Tabung();

        tabung.setSuperPhi(3.14);
        tabung.setSuperR(10);
        tabung.setT(3);
        tabung.volume();
    }
}
