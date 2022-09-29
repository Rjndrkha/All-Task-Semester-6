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
public class QueueClassModif {

    public int max, size, front, rear, Q[], data[];

    public QueueClassModif(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
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

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Front Elemen : " + Q[front]);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Number of Queue = " + size);
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue is Full");
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
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
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
        }
        return data;
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Rear Elemen : " + Q[rear]);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void peekPosition(int data) {
        if (!IsEmpty()) {
            int q = 0;
            int i = front;
            while (i != rear) {
                if (Q[i] == data) {
                    q = i + 1;
                    break;
                }
                i = (i + 1) % max;
            }
            System.out.println("Queue No." + data + " in the queue- " + q);
        } else {
            System.out.println("The queue is up");
        }
    }

    public void peekAt(int position) {
        int z = position;
        if (!IsEmpty()) {
            int x = (front + z - 1) % max;
            System.out.println("Queue No- " + z + " is " + Q[x]);
        }
    }
}
