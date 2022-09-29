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
import java.util.*;
public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 30) {
            age = 30;
        } else if(newAge <=18 && newAge >=0){
            age = newAge;
        }else{
            System.out.println("==EROR==");
        }
    }

}

class EncapTest{
    public static void main(String[] args) {
        EncapDemo call=new EncapDemo();
        Scanner sc=new Scanner(System.in);
        System.out.println("===== INPUT PLEASE =======");
        System.out.print("Input Nama ");
        String name=sc.next();
        System.out.print("Input Age: ");
        int umr=sc.nextInt();
        System.out.println();
        System.out.println("==========================");
        call.setName(name);
        call.setAge(umr);
        
        System.out.println("Name : "+call.getName());
        System.out.println("Age    : "+call.getAge());
    }
}

