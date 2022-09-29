/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author Rajendra Rakha
 */
public class LinkedListModif {

    Node head;
    int size;

    public LinkedListModif() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Index value out of bounds");
        } else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

    public void addByValue(int item, int find) throws Exception {
        if (getIndex(find) < 0 || getIndex(find) > size) {
            throw new Exception("Index value out of bounds");
        } else if (isEmpty() || getIndex(find) == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < getIndex(find); i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

    public int getIndex(int key) {
        int index = 0;
        Node tmp = head;
        while (tmp != null) {
            if (key == tmp.next.data) {
                return index + 1;
            }
            if ((tmp.data == key) && (tmp == head)) {
                return index = 0;
            }
            index++;
            tmp = tmp.next;
        }
        return -1;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Blank Linked Lists");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Blank Linked Lists");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void getKey(int key) throws Exception {
        if (isEmpty()) {
            throw new Exception("Blank Linked Lists");
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (key == tmp.next.data) {
                    System.out.println("Value " + key + " found in index " + getIndex(key));
                }
                if ((tmp.data == key) && (tmp == head)) {
                    getFirst();
                    System.out.println("Value " + key + " found in index " + getIndex(key));
                }
                tmp = tmp.next;
            }
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of bounds");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of bounds");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
            System.out.println("Data successfully deleted");
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
        System.out.println("Data successfully deleted");
    }

    public void removeByValue(int value) throws Exception {
        if (isEmpty()) {
            throw new Exception("Blank Linked Lists");
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (value == tmp.next.data) {
                    System.out.println("Data successfully deleted");
                    tmp.next = tmp.next.next;
                    break;
                }
                if ((tmp.data == value) && (tmp == head)) {
                    removeFirst();
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void clear() {
        head = null;
        size = 0;
        System.out.println("Clear data successful");
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Blank Linked Lists");
        }
    }
}
