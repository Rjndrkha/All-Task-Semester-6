/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicum.Exercise;

/**
 *
 * @author HP
 */
public class Zombie implements Destroyable {

    protected int health;
    protected int level;

    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return "";
    }
}
