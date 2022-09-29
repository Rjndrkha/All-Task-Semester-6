/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

/**
 *
 * @author Rajendra Rakha
 */
public class Marlo {

    public int right, left, top, buttom, position;

    public void MoveRight(int pos) {
        pos = position;
        position = (right + 1) + (left - 1);
    }

    public void MoveLeft(int lef) {
        lef = position;
        position = (left + 1) + (right - 1);
    }

    public void MoveUp(int up) {
        up = position;
        position = (top + 1) + (buttom - 1);
    }

    public void MoveDown(int md) {
        md = position;
        position = (buttom + 1) + (top - 1);
    }

    public void info() {
        
        position = right  + left + top + buttom;
    }
    public static void main(String[] args) {
        
    }
}
