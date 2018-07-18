/*
 * Cook class extends Staff. They are required to login with their name and password.
 * They are able to view orders in chronological order, view each item in an order, 
 * and mark an order as completed.
 */

package Users;

import Backend.Order;

/**
 * @version 7/2/2018
 * @author taylorfern
 */

public class Cook extends Staff
{
    /**
     * Overloaded constructor
     * @param name
     * @param password 
     */
    public Cook(String name, String password) 
    {
        super(name, password);
    }
    
    /**
     * Accessor method
     * Returns the name of the Staff member
     * @return name
     */
    @Override
    public String getName() 
    {
        return name;
    }

    /**
     * Mutator method
     * Sets the name of the Staff member
     * @param name 
     */
    @Override
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * Accessor method
     * Returns the password of the Staff member
     * @return 
     */
    @Override
    public String getPassword() 
    {
        return password;
    }

    /**
     * Mutator method
     * Sets the password of the staff member
     * OR resets the password of the staff member
     * @param password 
     */
    @Override
    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    /**
     * Users can login
     * @param name
     * @param password
     * @return 
     */
    @Override
    public String login(String name, String password) 
    {
        return super.login(name, password); 
    }
    
    /**
     * Returns the string representation of the order priority queue
     * @return order
     */
    public String viewOrders()
    {
        //view the priority queue
        return null;
    }
    
    /**
     * Returns the orders list of items 
     * @param order
     * @return Order 
     */
    public String viewOrderContents(Order order)
    {
        return super.viewOrder(order);
    }
    
    /**
     * Allows user to mark the order completed
     * (Deletes from priority queue)
     * @param orderNumber
     */
    public void markOrderCompleted(int orderNumber)
    {
        
        System.out.println("Order number " + orderNumber + "is ready!");
    }
    
}
