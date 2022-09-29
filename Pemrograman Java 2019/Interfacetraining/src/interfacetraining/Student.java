/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetraining;

/**
 *
 * @author Rajendra Rakha
 */
public class Student implements ICumlaude{
    
    protected String name;
    
    public Student(String name){
        this.name=name;
    }
    
    public void studyInCampus(){
        System.out.println("I am a Student,My name is "+this.name);
        System.out.println("I study in campus.");
    }
    @Override
    public void graduate() {
        System.out.println("I have finished the thesis for Undergraduated");
    }
    
    @Override
    public void getHighGPA() {
        System.out.println("My GPA is more than 3,1");
    }
    
}
