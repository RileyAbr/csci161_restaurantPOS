/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

/**
 *
 * @author riley.abrahamson
 */
public abstract class Drink extends Item {
    private boolean onRocks;    

    public Drink(String newName, int newPriority, double newPrice) {
        super(newName, newPriority, newPrice);
    }

    public boolean isOnRocks() {
        return onRocks;
    }

    public void setOnRocks(boolean onRocks) {
        this.onRocks = onRocks;
    }

    private char size; 

    
    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " Size: " + size;
    }
    
}

