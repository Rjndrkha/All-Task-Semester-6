/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum4;

/**
 *
 * @author Rajendra Rakha
 */
class ClassA {

    ClassA() {
        System.out.println("Konstruktor A dijalankan");
    }

}

class ClassB extends ClassA {

    ClassB() {
        System.out.println("Konstruktor B dijalankan");
    }
}

class ClassC extends ClassB {

    ClassC() {
        super();
        System.out.println("Konstruktor C dijalankan");
    }
}

public class MAIN {

    public static void main(String[] args) {
        ClassC test = new ClassC();

    }

}
