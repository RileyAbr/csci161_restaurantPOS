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

public class Salad extends Appetizer {
    private boolean hasCroutons;
    
    public Salad(String newName, double newPrice, boolean isCheesy, boolean isCroutony)
    {
        super(newName, newPrice, isCheesy);
        hasCroutons = isCroutony;
    }

    public boolean isHasCroutons() {
        return hasCroutons;
    }

    public void setHasCroutons(boolean hasCroutons) {
        this.hasCroutons = hasCroutons;
    }

    @Override
    public String toString() {
        return super.toString() + " Croutons: " + hasCroutons;
    }
    
}
