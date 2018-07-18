/*
 * User interface to define methods for Staff and Customer classes.
 */

package Users;

import Backend.Order;
import MenuItems.Item;

/**
 * @version 6/27/2018
 * @author taylorfern
 */

public abstract class User 
{

    /**
     * Method that allows user to login 
     * @param name
     * @param password
     * @return "Login successful!" or "login failed"
     */
    public abstract String login(String name, String password); 
    
    /**
     * Method that creates a new order and adds a single item to it
     * @param item
     * @return order
     */
    public abstract Order order(Item item);
    
    
    /**
     * Method to allow a user to add items to their previously made order
     * @param order
     * @param item
     * @return 
     */
    public abstract Order addToOrder(Order order, Item item);
    
    
    /**
     * Accessor method
     * Method that allows user to view the submitted order 
     * @param order
     * @return string representation of the order 
     */
    public abstract String viewOrder(Order order);
 
    /**
     * Method that allows user to edit the order. 
     * @param order
     * @return new order
     */
    public abstract String editOrder(Order order);
}
