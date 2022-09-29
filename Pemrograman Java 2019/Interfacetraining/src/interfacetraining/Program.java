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
public class Program {

    public static void main(String[] args) {

        Rector MrRector = new Rector();

        //Student ordinaryStudent = new Student("Charlie");
        Undergraduated undergraduatedCumlaude = new Undergraduated("Joe");
        Postgraduated postgraduatedCumlaude = new Postgraduated("Biden");

        //MrRector.giveCumlaudeCertificate(ordinaryStudent);
        //MrRector.giveCumlaudeCertificate(undergraduatedCumlaude);
        //MrRector.giveCumlaudeCertificate(postgraduatedCumlaude);
        
        MrRector.giveCertificateOfTopStudent(undergraduatedCumlaude);
        MrRector.giveCertificateOfTopStudent(postgraduatedCumlaude);
    
    
    }
}
