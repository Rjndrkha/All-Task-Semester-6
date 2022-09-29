/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Rajendra Rakha
 */
public class nomer2 {

    int size;
    String kalimat = "";
    int top = 0;
    String data[] = new String[20];

    public void kalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    public String simpanKalimat() {
        return kalimat;
    }

    public int simpanSize() {
        size = kalimat.length();
        return size;
    }

    public void push(String dt) {
        top++;
        data[top] = dt;
    }

    public String pop(int top) {
        String dt = data[top];
        top--;
        return dt;
    }

    public void konversi() {
        String dt = "";
        char c;
        for (int i = 0; i < size; i++) {
            c = kalimat.charAt(i);
            dt += String.valueOf(kalimat.charAt(i));
            if (c == ' ') {
                push(dt);
                dt = "";
            }
        }
        push(dt);
    }

    public void print() {
        String dt = "";
        System.out.print("Kalimat dibalik : ");
        for (int i = top; i >= 1; i--) {
            dt += pop(i) + " ";
        }
        System.out.println(dt);
    }
}
