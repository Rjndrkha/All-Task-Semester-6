/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Rajendra Rakha A.P, Code : A
package quizrajendra;

/**
 *
 * @author Rajendra Rakha
 */
public class QuizRajendra1 {

    public double nilaiTugas[], nilai[];
    public String namaMhs[];
    public double sum = 0;

    public QuizRajendra1(int a) {
        namaMhs = new String[a];
        nilaiTugas = new double[a];

    }

    //caraBF
    double Rumus() {
        double cara;
        cara = sum / nilaiTugas.length;
        return cara;
    }

}
