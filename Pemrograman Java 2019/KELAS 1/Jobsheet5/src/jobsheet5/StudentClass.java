/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author Rajendra Rakha
 */
public class StudentClass {
    String name;
    int yearEntry,age;
    double gpa;
    public StudentClass (String n,int y,int a,double g){
        name=n;
        yearEntry=y;
        age=a;
        gpa=g;
    }
    void print (){
        System.out.println("Name= "+name);
        System.out.println("Year Of Entry= "+yearEntry);
        System.out.println("Age= "+age);
        System.out.println("GPA= "+gpa);
    }
    
}
