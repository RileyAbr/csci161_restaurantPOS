/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import MenuItems.Item;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author riley.abrahamson
 */
public class Order {
    
    private String customerName;
    private int orderNum;
    private static int totalOrders;
    private PriorityQueue<Item> order;
    
    public Order(String customer, Comparator comp)
    {
        order = new PriorityQueue<>(comp);
        totalOrders++;
        orderNum = totalOrders;
    }
    
    /**
     * Adds a menu item to part of the order
     * @param item the Item to be added
     */
    public void addItem(Item item)
    {
        order.add(item);
    }
    
    /**
     * Removes a menu item if possible and returns whether it did or not
     * @param item the item to potentially be removed
     * @return boolean representing where the item isRemoved
     */
    public boolean removeItem(Item item)
    {
        return order.remove(item);
    }
    
    public String getCustomerName()
    {
        return customerName;
    }
    
    public void setCustomerName(String newCustomer)
    {
        customerName = newCustomer;
    }
    
    public int getOrderNum()
    {
        return orderNum;
    }
    
    public void setOrderNum(int newOrderNum)
    {
        orderNum = newOrderNum;
    }
    
    public Item peek()
    {
        return order.peek();
    }
    
    public void clearOrder()
    {
        order.clear();
    }
    
    public double getTotalPrice()
    {
        double sumPrice = 0;
        
        for(Item item : order)
        {
            sumPrice += item.getPrice();
        }
        
        return sumPrice;
    }
    
    public Item[] getAll()
    {
        Item[] allItems = new Item[order.size()];
        
        for(int i = 0; i < order.size(); i++)
        {
            Item temp = order.poll();
            allItems[i] = temp;
            order.add(temp);
        }
        
        return allItems;
    }
    
    @Override
    public String toString()
    {
        String temp = "";
        
        for(Item item : order)
        {
            temp += item.toString();
            temp += "\n";
        }
        
        return temp;
    }
    
}
