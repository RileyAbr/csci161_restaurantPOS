/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interfaces.MenuList;
import Interfaces.ProductInfo;
import MenuItems.Item;
import MenuItems.Appetizer;
import MenuItems.Drink;
import MenuItems.Entre;
import java.util.ArrayList;

/**
 *
 * @author riley.abrahamson
 */
public class Menu implements MenuList {
    
    private ArrayList<Drink> drinkMenu;
    private ArrayList<Appetizer> appMenu;
    private ArrayList<Entre> entreMenu;
    
    private ArrayList<ArrayList<? extends ProductInfo>> fullMenu; //Stores other menus of each item categorey
    
    public Menu()
    {
        drinkMenu = new ArrayList<>();
        appMenu = new ArrayList<>();
        entreMenu = new ArrayList<>();
        
        
        
        fullMenu = new ArrayList<>();
        fullMenu.add(drinkMenu);
        fullMenu.add(appMenu);
        fullMenu.add(entreMenu);   
    }

    @Override
    public ArrayList<ProductInfo> getAll() 
    {
        ArrayList<ProductInfo> temp = new ArrayList(); 
        for(ArrayList<? extends ProductInfo> list : fullMenu)
        {
            for(ProductInfo product : list)
            {
                temp.add(product);
            }
        }
        return temp; 
    }

    @Override
    public ArrayList<ProductInfo> getKeyword(String keyword) 
    {
        ArrayList<ProductInfo> temp = new ArrayList();
        for(ArrayList<? extends ProductInfo> list : fullMenu)
        {
            for(ProductInfo product : list)
            {
                if(product.containsKeyword(keyword))
                {
                    temp.add(product);
                }
            }
        }
        return temp; 
    }
    
}
