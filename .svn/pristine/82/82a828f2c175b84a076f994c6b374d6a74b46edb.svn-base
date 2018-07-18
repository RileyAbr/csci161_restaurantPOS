/*
 * Staff Interface that defines some methods for both the Cook and Admin classes.
 * Staff are required to login with both their name and password.
 */

package Users;

import Backend.Order;
import MenuItems.Item;
import java.util.Objects;
import Utilities.PriorityComparator;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * @version 7/3/2018
 * @author taylorfern
 */

public class Staff extends User
{
    public String name;
    public String password;
    private int size;
    protected static Staff[] staff;

    /**
     * Overloaded constructor
     * Adds new staff member to String[] staff
     * @param name
     * @param password 
     */
    public Staff(String name, String password) 
    {  
        this.name = name.toUpperCase();
            //made uppercase in order to  eliminate some causes of failed login
        this.password = password;
        size++;
        this.addTo(Staff.this);
    }

    /**
     * Add method to add new constructed Staff Object 
     * to Staff array.
     * @param staffObject 
     */
    private void addTo(Staff staffObject)
    {
        staff[(size-1)] = staffObject;
    }
    
    /**
     * Accessor method
     * Returns the name of the staff member
     * @return name
     */
    public String getName() 
    {
        return name.toUpperCase();
    }

    /**
     * Mutator method
     * Sets the name of the staff member
     * @param name 
     */
    public void setName(String name) 
    {
        this.name = name.toUpperCase();
    }

    /**
     * Accessor method
     * Returns the password of the staff member
     * @return 
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * Returns a String representation of the Staff object
     * @return String of Staff object
     */
    @Override
    public String toString() 
    {
        return "Staff{" + "name=" + name + ", password=" + password + '}';
    }
    
    /**
     * Return a String representation of the staff array containing staff objects
     * @return String of Staff[] staff
     */
    public String toStringStaff() 
    {
        return "Staff{" + "staff=" + staff + '}';
    }


    /**
     * Tests if the Staff objects are equal
     * @param obj
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Staff other = (Staff) obj;
        if (!Objects.equals(this.name, other.name)) 
        {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) 
        {
            return false;
        }
        return true;
    } 
    
    /**
     * Mutator method
     * Sets the password of the staff member OR
     * Changes password of the staff member
     * @param password 
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }

     /**
     * Method that allows user to login 
     * @param name
     * @param password
     * @return "Login successful!" or "login failed"
     */
    @Override
    public String login(String name, String password)
    {
        String output = "";
        for (int i = 0; i < size; i ++)
        {
            if(staff[i].getName().equals(name.toUpperCase()))
            {
                if(staff[i].getPassword().equals(password))
                {
                    output = "Login successful!";
                }
                else
                {
                    output = "Login failed!";
                }
            }
            else
            {
                output = "Login failed!";
            }
        }
        return output;  
    }

    
    /**
     * Method that creates a new order and adds a single item to it
     * @param item
     * @return order
     */
    @Override
    public Order order(Item item) 
    {
        PriorityComparator comp = new PriorityComparator();
        Order order = new Order(getName(), comp);
        
        
        order.addItem(item);
        return order;
    }
    
    /**
     * Method to allow a user to add items to their previously made order
     * @param order
     * @param item
     * @return 
     */
    @Override
    public Order addToOrder(Order order, Item item) 
    {
        order.addItem(item);
        return order;
    }
    
    /**
     * Accessor method
     * Method that allows user to view the submitted order
     * @param order
     * @return string representation of the order 
     */
    @Override
    public String viewOrder(Order order) 
    {
        return order.toString();
    }
    

    /**
     * Method that allows user to edit the order.
     * @param order 
     * @return new, edited order
     */
    @Override
    public String editOrder(Order order) 
    {
        viewOrder(order);
        Scanner scan = new Scanner(System.in);
        
        String[] choices = {"Add" , "Delete"};
        String input = (String) JOptionPane.showInputDialog(null, "What would you like to do?",
        null, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        
        String method = input;
        
        Item[] choices2 = order.getAll();
        String input2 = (String) JOptionPane.showInputDialog(null, "For which item?",
        null, JOptionPane.QUESTION_MESSAGE, null, choices2, choices2[0]);
        
        String item = input2;
        Item finalItem = null;
        
        for(int i = 0; i < choices2.length; i++)
        {
            if(item.equals(choices2[i].toString()))
            {
                finalItem = choices2[i];
            }
        }
        
        if(method.equals("Add"))
        {
            order.addItem(finalItem);
        }
        if(method.equals("Delete"))
        {
            order.removeItem(finalItem);
        }
        
        return order.toString();
        
    }
    
}
