/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rajendra.relasiclass;

/**
 *
 * @author Rajendra Rakha
 */
class processor {

    private String merk;
    private double cache;

    public processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    processor() {

    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}

class Laptop {

    private String merk;
    private processor proc;

    Laptop() {

    }

    public Laptop(String merk, processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public processor getProc() {
        return proc;
    }

    public void setProc(processor proc) {
        this.proc = proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}

public class practicum1 {

    public static void main(String[] args) {
        processor p = new processor("Intel i5", 3);
        
        Laptop l = new Laptop("ThinkPad", new processor("Intel i5",3));

        l.info();

        processor p1 = new processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop l1 = new Laptop();
        l1.setMerk("ThinkPad");
        l1.setProc(p1);
        l1.info();

    }

}
