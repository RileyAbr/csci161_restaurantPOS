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
public abstract class Appetizer extends Item {
    
    private boolean hasCheese;
    
    Appetizer(String newName, double newPrice, boolean isCheesy)
    {
        super(newName, 2, newPrice);
        hasCheese = isCheesy;
    }
    
    public boolean getHasCheese()
    {
        return hasCheese;
    }
    
    public void setHasCheese(boolean isCheesy)
    {
        hasCheese = isCheesy;
    }

    @Override
    public String toString() {
        return super.toString() + " Cheesy: " + hasCheese;
    }
    
    
}
