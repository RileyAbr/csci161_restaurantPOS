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
 public abstract class Entre extends Item {
  private String sauces;
  private String sides;

    public Entre(String newName, int newPriority, double newPrice) {
        super(newName, newPriority, newPrice);
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
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
