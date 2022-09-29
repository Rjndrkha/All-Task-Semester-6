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
public class ListAchievementStudentsClass {

    StudentClass listSdt[] = new StudentClass[5];
    int idx;

    void add(StudentClass m) {
        if (idx < listSdt.length) {
            listSdt[idx] = m;
            idx++;
        } else {
            System.out.println("Data is Full");
        }
    }

    void print() {
        for (StudentClass m : listSdt) {
            m.print();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listSdt.length - 1; i++) {
            for (int j = 1; j < listSdt.length - 1; j++) {
                if (listSdt[j].gpa > listSdt[j - 1].gpa) {
                    StudentClass tmp = listSdt[j];
                    listSdt[j] = listSdt[j - 1];
                    listSdt[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listSdt.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listSdt.length; j++) {
                if (listSdt[j].gpa < listSdt[idxMin].gpa) {
                    idxMin = j;
                }
            }
            StudentClass tmp = listSdt[idxMin];
            listSdt[idxMin] = listSdt[i];
            listSdt[i] = tmp;
        }
    }

    void insertionSort(boolean ascending) {
        int i, j;
        for (i = 1; i < listSdt.length; i++) {
            StudentClass temp = listSdt[i];
            j = i;
            if (ascending){
                
            }else{
                
            }
            listSdt[j] = temp;
        }
    }
}
