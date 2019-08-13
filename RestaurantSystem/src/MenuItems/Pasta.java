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
public class Pasta extends Entre {
    private boolean glutenFree;
    
    public Pasta(String newName, double newPrice, char newSize, boolean isGlutenFree)
    {
        super(newName, newSize, newPrice);
        glutenFree = isGlutenFree;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    @Override
    public String toString() {
        return super.toString() + " Gluten-Free: " + glutenFree;
    }
    
    
}
