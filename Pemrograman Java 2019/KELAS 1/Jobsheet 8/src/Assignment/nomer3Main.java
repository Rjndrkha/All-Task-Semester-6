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
import java.util.*;

public class nomer3Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nomer3 pre = new nomer3();
        System.out.println("Masukkan ekspresi matematika: ");
        String input = sc.next();
        pre.prefix(input);
    }
}
