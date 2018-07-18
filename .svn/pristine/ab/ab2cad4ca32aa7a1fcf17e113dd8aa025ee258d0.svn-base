/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Utilities.LinkedQueue;


/**
 *
 * @author riley.abrahamson
 */
public class OrderWheel{
 
    private static LinkedQueue<Order> orderWheel;
    
    /**
     * Adds an order to the end of the list
     * @param o the order to be added
     */
    public static void addOrder(Order o)
    {
        orderWheel.enqueue(o);
    }
    
    /**
     * Checks whether the OrderWheel contains an order and removes it if it does
     * @param o the object to be removed
     * @return a boolean showing whether the object was removed or not
     */
    public static boolean removeOrder(Order o)
    {
        boolean flag = false;
        
        for(int i = 0; i < orderWheel.size(); i++)
        {
            if(orderWheel.first().equals(o))
            {
                orderWheel.dequeue();
                flag = true;
            }
            
            orderWheel.enqueue(orderWheel.dequeue());
        }
        
        return flag;
    }
    
    
}
