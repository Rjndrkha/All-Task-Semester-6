/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_Rajendra;

/**
 *
 * @author Rajendra Rakha
 */
class Node<T> {

    public Node<T> prev;
    public T data;
    Node<T> left;
    Node<T> right;
    public Node<T> next;

    public Node(Node<T> prev, T data, Node<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;

    }
}

public class DoubleLinkedList_Rajendra<T> {

    private Node<T> head;
    private int size;

    public DoubleLinkedList_Rajendra() {
        head = null;
        size = 0;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T item) {
        if (isEmpty()) {
            head = new Node<>(null, item, null);
        } else {
            Node<T> newNode = new Node<>(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(current, item, null);
            size++;
        }
    }

    void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void add(T item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 && index > size) {
            throw new Exception("The index value is Out Of Bounds");
        } else {
            Node<T> current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node<T> newNode = new Node<>(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node<T> newNode = new Node<>(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node<T> tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nSuccessfully filled");
        } else {
            System.out.println("Empty LinkedList");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty, can't be deleted!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty, can't be deleted!");
        } else if (head.next == null) {
            head = null;
            size--;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        do {
            if (isEmpty() || index >= size) {
                throw new Exception("The index value is Out Of Bounds");

            } else if (index == 0) {
                removeFirst();
            } else {
                Node<T> current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    current.prev.next = null;
                } else if (current.prev == null) {
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
        } while (isEmpty() || index >= size);
    }

    public T getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Linked List");
        }
        return head.data;
    }

    public T getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Linked List");
        } else {
            Node<T> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public T get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("The index value is Out Of Bounds");
        }
        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public T getIndex(T item) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Linked List");
        } else {
            Node<T> tmp = head;
            while (tmp.next != item) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    void bubbleSortAscending() throws Exception {
        Node<Book_Rajendra> current;
        Book_Rajendra buku;

        for (int i = 0; i < size; i++) {
            current = (Node<Book_Rajendra>) head;
            while (current.next != null) {
                if (current.data.code > current.next.data.code) {
                    buku = current.data;
                    current.data = current.next.data;
                    current.next.data = buku;
                }
                current = current.next;
            }
            current = current.prev;
        }
    }

    public static void addBook(DoubleLinkedList_Rajendra<Book_Rajendra> bookList, Book_Rajendra book) {
        boolean added = false;
        try {
            // Looping to check the code of the book entered
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getCode() == book.getCode()) {
                    // If the book code already exists, update the stock according to the input
                    bookList.get(i).setStock(bookList.get(i).getStock() + book.getStock());
                    added = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // If you don't have it, add a new book item
        if (!added) {
            bookList.addLast(book);
        }
    }
}
