/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Rajendra Rakha
 */
public class no2 {

    public int[][] data;
    public int totdata;
    public int sumadata;
    public int positionc;

    public no2(int[][] Data, int totaldata, int sumdata) {
        totdata = totaldata;
        sumadata = sumdata;
        data = Data;

    }

    public int FindSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < totdata; i++) {
            for (int j = 0; j < sumadata; j++) {
                if (data[i][j] == search) {
                    position = j;
                    positionc = i;
                    break;
                }
            }
        }
        return position;
    }

    void printData() {
        for (int i = 0; i < totdata; i++) {
            for (int j = 0; j < sumadata; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void printPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " found at index " + (pos + 1) + "," + positionc);
        } else {
            System.out.println("data " + x + " not found ");
        }
    }
}
