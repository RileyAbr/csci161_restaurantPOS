/*
 * Class Customer extends User. Customer is able to "login" with their name and 
 * phone number. They also are able to order, edit order, etc.
 */

package Users;

import Backend.Order;
import MenuItems.Item;
import Utilities.PriorityComparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @version 7/2/2018
 * @author taylorfern
 */

public class Customer extends User 
{
    private String name;
    private String phoneNumber;
    private int orderNumber;

    /**
     * Overloaded constructor
     * @param name
     * @param phoneNumber
     * @param orderNumber 
     */
    public Customer(String name, String phoneNumber, int orderNumber) 
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orderNumber = orderNumber;
    }

    /**
     * Accessor method
     * Returns the name of the customer
     * @return name 
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Mutator method
     * Sets the name of the customer
     * @param name 
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * Accessor method
     * Returns the phone number of the customer
     * @return phoneNumber 
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
     * Mutator method
     * Sets the phone number of the customer
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Accessor method
     * Returns the order number of the customer
     * @return orderNumber
     */
    public int getOrderNumber() 
    {
        return orderNumber;
    }

    /**
     * Accessor method
     * Sets the order number of the customer
     * @param orderNumber 
     */
    public void setOrderNumber(int orderNumber) 
    {
        this.orderNumber = orderNumber;
    }
    
    /**
     * Method that allows user to login
     * or a customer to enter their "account"
     * @param name
     * @param phoneNumber
     * @return invalid message if phone number is not 7 integers, valid otherwise 
     */
    @Override
    public String login(String name, String phoneNumber) 
    {
        Customer customer = new Customer(name, phoneNumber, 0);
        if (phoneNumber.length()  == 6)
        {
            return "Valid phone number";
        }
        else
            return "Invalid phone number";
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
    
    /**
     * Theoretically allows the customer to pay for the order
     * In this case, displays the final price and tells the customer
     * to see the cashier to pay for the order.
     * @param order
     * @return 
     */
    public String payForOrder(Order order)
    {
        return "Your total price is $" + order.getTotalPrice() + "/nPlease see cashier.";
    }
    
    /**
     * Returns the orders by print out all the items
     * @param order
     */
    public void viewOrderContents(Order order)
    {
       Item[] items = order.getAll();
       for(int i = 0; i < items.length; i ++)
       {
           System.out.println(items[i].getName());
       }
    }
}
