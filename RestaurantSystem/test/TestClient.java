
import Backend.Order;
import MenuItems.Pizza;
import Utilities.PriorityComparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riley.abrahamson
 */
public class TestClient {
    
    public static void main(String[] args) {
        
        Pizza temp = new Pizza("Sausage Pizza", 10.99, 'M', true, false);
        Pizza temp2 = new Pizza("Bacon Pizza", 10.99, 'M', true, false);
        
        System.out.println(temp.toString());
        
        PriorityComparator comp = new PriorityComparator();
        Order foo = new Order("Darnell", comp);
        foo.addItem(temp);
        foo.addItem(temp2);
        
        System.out.println(foo.toString());
        
        
    }
    
}
