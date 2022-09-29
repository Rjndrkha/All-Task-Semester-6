/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author Rajendra Rakha
 */
public class Searching {



        public int[] data;
        public int totData;

        public Searching(int[] Data, int totalData) {
            totData = totalData;
            data = new int[totData];
            for (int i = 0; i < totData; i++) {
                data[i] = Data[i];
            }
        }

        public int FindSeqSearch(int search) {
            int position = -1;
            for (int j = 0; j < totData; j++) {
                if (data[j] == search) {
                    position = j;
                    break;
                }
            }
            return position;
        }

        void printData() {
            for (int i = 0; i < totData; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void printPosition(int x, int pos) {
            if (pos != -1) {
                System.out.println("data : " + x + " found at index " + pos);
            } else {
                System.out.println("data " + x + " not found ");
            }
        }

        public int FindBinarySearch(int search, int left, int right) {
            int mid;
            if (right >= left) {
                mid = (left + right) / 2;
                if (search == data[mid]) {
                    return (mid);
                } else if (data[mid] > search) {
                    return FindBinarySearch(search, left, mid - 1);
                } else {
                    return FindBinarySearch(search, mid + 1, right);
                }
            }
            return -1;
        }

    }

