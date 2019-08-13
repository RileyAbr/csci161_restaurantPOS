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
public class SoftDrink extends Drink {

    private boolean hasFizz;
    
    public SoftDrink(String newName, double newPrice, char newSize, boolean isFizzy)
    {
        super(newName, newSize, newPrice);
        hasFizz = isFizzy;
    }

    public boolean isHasFizz() {
        return hasFizz;
    }

    public void setHasFizz(boolean hasFizz) {
        this.hasFizz = hasFizz;
    }

    @Override
    public String toString() {
        return super.toString() + " Fizzy: " + hasFizz;
    }
    
    
}
