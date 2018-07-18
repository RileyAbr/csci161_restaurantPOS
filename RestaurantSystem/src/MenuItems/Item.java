/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

import Interfaces.ProductInfo;

/**
 *
 * @author riley.abrahamson
 */
public abstract class Item implements ProductInfo {

    private String name;
    private int prepTime;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    private int priority;
    

    Item(String newName, int newPriority, double newPrice)
    {
        name = newName;
        priority = newPriority;
        price = newPrice;
    }

    public int getPriority() {
        return priority;
    }

    
    
    @Override
    public boolean containsKeyword(String keyword)
    {
       return name.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public String toString() {
        return name + " - Priority: " + priority + " Price: " + price;
    }
}
