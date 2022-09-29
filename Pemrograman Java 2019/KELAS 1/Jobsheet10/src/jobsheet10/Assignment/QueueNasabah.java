/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10.Assignment;

/**
 *
 * @author Rajendra Rakha
 */
class NasabahClass {

    public String noRekening, nama;

    public NasabahClass(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }

    public NasabahClass() {
    }

    public void print() {
        System.out.println("=============================");
        System.out.println("No. Rekening   : " + noRekening);
        System.out.println("Nama Nasabah : " + nama);
        System.out.println("=============================");
        System.out.println();
    }
}

public class QueueNasabah {

    public int max, front, rear, size;
    NasabahClass Q[];

    QueueNasabah(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new NasabahClass[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(String norek, String nm) {
        if (IsFull()) {
            System.out.println("Queue Full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = new NasabahClass(norek, nm);
            size++;
        }
    }

    public void Dequeue() {
        NasabahClass data;
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            data.print();
        }
    }

    public void Print() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int i = front;
            while (i != rear) {
                Q[i].print();
                i = (i + 1) % max;
            }
            Q[i].print();
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            int i = front;
            System.out.println("First Elemen : ");
            Q[i].print();
            i = (i + 1) % max;
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Rear Element : ");
            Q[rear].print();
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void peekPosition(String nas) {
        if (!IsEmpty()) {
            int a = 1;
            int i = front;
            while (i != rear) {
                if (nas.equalsIgnoreCase(Q[i].nama)) {
                    break;
                }
                i = (i + 1) % max;
                a++;
            }
            System.out.println("Nama Nasabah " + Q[i].nama + ", No Rekening " + Q[i].noRekening + " pada antrian ke- " + a);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void printNasabah(int pos) {
        if (!IsEmpty() && pos <= size) {
            int i = (front + pos - 1) % max;
            System.out.println("No antrian ke- " + pos);
            Q[i].print();
        } else {
            System.out.println("Queue is Empty");
        }
    }
}
