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
public class Pizza extends Entre {
    private boolean hasMeat;
    private boolean hasPineapple;

    public Pizza(String newName, double newPrice, char newSize, boolean isMeaty, boolean isPineappley)
    {
        super(newName, newSize, newPrice);
        hasMeat = isMeaty;
        hasPineapple = isPineappley;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public boolean isHasPineapple() {
        return hasPineapple;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    public void setHasPineapple(boolean hasPineapple) {
        this.hasPineapple = hasPineapple;
    }

    @Override
    public String toString() {
        return super.toString() + " Meaty: " + hasMeat + " Pineapple: " + hasPineapple;
    }
    
}
