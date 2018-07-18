/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import MenuItems.Item;
import java.util.ArrayList;

/**
 *
 * @author riley.abrahamson
 */
public interface MenuList 
{
    
    //Receive Entire List of Items
    public ArrayList<ProductInfo> getAll();
    
    //Serach for keywords in an item
    public ArrayList<ProductInfo> getKeyword(String keyword);
}
