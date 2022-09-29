/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Rajendra Rakha
 */
class Tugas3Dta {

    public Object data;
    public Tugas3Dta next;

    public Tugas3Dta() {
        data = ' ';
        next = null;
    }

    public Tugas3Dta(Object val) {
        data = val;
        next = null;
    }
}

public class nomer3 {

    private Tugas3Dta top;

    public nomer3() {
        top = null;
    }

    public boolean empty() {
        return top == null;
    }

    public boolean full() {
        return false;
    }

    public void push(Object e) {
        Tugas3Dta tmp = new Tugas3Dta(e);
        tmp.next = top;
        top = tmp;
    }

    public Object pop() {
        Object e = top.data;
        top = top.next;
        return e;
    }

    public Object peek() {
        Object e = top.data;
        return e;
    }

    public void prefix(String x) {
        String output = "";
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == ('+') || c == ('*') || c == ('-') || c == ('/')) {
                while (!empty() && prioritas(peek()) <= prioritas(c)) {
                    output += pop();
                }
                push(c);
            }
        }
        while (!empty()) {
            output += pop();
        }
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == ('+') || c != ('*') || c != ('-') || c != ('/')) {
                while (!empty() && prioritas(peek()) >= prioritas(c)) {
                    output += pop();
                }
                push(c);
            } else {
                output += c;
            }
            if (c == ')') {
                pop();
            }
            if (c == '(') {
                pop();

            }
            if (c == ('+') || c == ('*') || c == ('-') || c == ('/')) {
                pop();
            }
        }
        while (!empty()) {
            output += pop();
        }
        System.out.println("Notasi Prefix : " + output);
    }

    public int prioritas(Object x) {
        if (x.equals('+') || x.equals('-')) {
            return 2;
        } else if (x.equals('*') || x.equals('/')) {
            return 1;
        } else {
            return 0;
        }
    }
}
