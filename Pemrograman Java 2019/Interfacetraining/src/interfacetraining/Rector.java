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
public class Rector {

    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("I'm a Rector, give a Cumlaude Certificate");
        System.out.println("Congratulation! Please introduce yourself..");

        student.studyInCampus();
        student.graduate();
        student.getHighGPA();

        System.out.println("----------------------------------");
    }
    public void giveCertificateOfTopStudent(IAchievers student){
        System.out.println("I'm a Rector, give a Certification of Top Score");
        System.out.println("Congratulation! How You Can get Achievement? ");
        
        student.winTheCompetition();
        student.publishTheJournal();
        
        System.out.println("----------------------------------");
    } 

}
