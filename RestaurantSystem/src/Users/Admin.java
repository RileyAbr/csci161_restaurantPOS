/*
 * Admin class unique to Cook class because of more access. Admins are able
 * to remove and add menu items as well as change item's prices. The admin is 
 * also able to get the total sales report.
 */

package Users;

import Backend.Menu;
import MenuItems.*;

/**
 * @version 7/2/18
 * @author taylorfern
 */

public class Admin extends Staff
{
    Menu menu;

    /**
     * Overloaded constructor
     * creates new Staff member
     * @param name
     * @param password 
     */
    public Admin(String name, String password) 
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
     * Method to allow Admin to add menu item
     * @param name
     * @param prepTime
     * @param price
     * @param menuItemType
     */
    public void addMenuItem(String name, double price, int prepTime, String menuItemType)
    {
        //write some method to add an item to the menu
    }
    
    /**
     * Method to allow Admin to remove a menu item
     * @param item 
     */
    public void removeMenuItem(Item item)
    {
        //write some method to remove this item to the menu
    }
    
    /**
     * Method to allow Admin to edit price of a menu item
     * @param item 
     * @param price 
     */
    public void editItemPrice(Item item, double price)
    {
        item.setPrice(price);
    }
    
    /**
     * Returns the string representation of the order priority queue
     */
    public void viewOrders()
    {
         
    }
    
    /**
     * Method to return total sales
     */
    public void totalSales()
    {
        
    }
    
    
    
}
