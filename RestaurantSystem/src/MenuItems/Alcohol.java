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
public class Alcohol extends Drink {
    
    private int proof;
    
    public Alcohol(String newName, double newPrice, char newSize, int newProof)
    {
        proof = newProof;
    }

    public int getProof() {
        return proof;
    }

    public void setProof(int proof) {
        this.proof = proof;
    }

    @Override
    public String toString() {
        return super.toString() + " Proof: " + proof;
    }    
}
