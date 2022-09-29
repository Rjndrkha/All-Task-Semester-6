/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3;

/**
 *
 * @author Rajendra Rakha
 */
public class motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 100) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF! \n");
            }
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin OFF! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}

class MotorDemo {

    public static void main(String[] args) {
        motor call = new motor();
        call.printStatus();
        call.tambahKecepatan();

        call.nyalakanMesin();
        call.printStatus();

        call.tambahKecepatan();
        call.printStatus();

        call.tambahKecepatan();
        call.printStatus();

        call.tambahKecepatan();
        call.printStatus();

        call.matikanMesin();
        call.printStatus();
    }
}
