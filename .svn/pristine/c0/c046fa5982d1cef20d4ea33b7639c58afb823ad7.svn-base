/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import MenuItems.Alcohol;
import MenuItems.Pasta;
import MenuItems.Pizza;
import MenuItems.Salad;
import MenuItems.SoftDrink;
import MenuItems.Soup;
import java.util.Random;

/**
 *
 * @author riley.abrahamson
 */
public class MenuFactory {
    
    private static String[] alcoholNames = {"Tap", "Amsterdam", "Circok","BlueBerry Vodka","GreyGoose","Don jon","Patrone","Jose","Shirley Temple","Sexy On The Beach", "Cool Blue", "Reds Apples Ale", "Heineken","Corona","Blue Moon","Stella"};
    private static String[] softDrinkNames = {"Coka-Cola", "Pepsi", "Sprite", "7-Up", "Lemonade", "Fanta", "Mountain Dew"};
    
    private static String[] soupNames = {"Chicken Noodle", "Chowder", "Gazpacho", "Noodle", "Squah", "MatertiJebem"};
    private static String[] saladNames = {"Chicken", "Mediterranean", "Pasta", "Caeser", "Garden", "Potato"};
    
    private static String[] pizzaNames = {"Sausage", "Pepperoni", "Canadian Bacon", "Alfredo", "Margharita", "Deluxe", "Supreme", "Cheese", "Veggie"};
    private static String[] pastaNames = {"Alfredo", "Shrimp Fettuccine", "Spaghetti", "Lasagna", "Ravioli", "Taglierini", "Guza", "Busiata"};
    
    private static char[] sizes = {'S', 'M', 'L'};
    
    private static Random rand = new Random();
        
    public static Pizza getPizzaExample()
    {
        String name = pizzaNames[rand.nextInt(pizzaNames.length)];
        double price = rand.nextInt(9) + 4.99;
        char size = sizes[rand.nextInt(sizes.length)];
        
        return new Pizza(name, price, size, rand.nextBoolean(), rand.nextBoolean());
    }
    public static Pasta getPastaExample(){
        String name = pastaNames[rand.nextInt(pastaNames.length)];
        double price = rand.nextInt(8) + 4.99;
        char size = sizes[rand.nextInt(sizes.length)];
        
        return new Pasta(name, price, size, rand.nextBoolean());
    }
    public static Salad getSaladExample(){
        String name = saladNames[rand.nextInt(saladNames.length)];
        double price = rand.nextInt(6) + 4.99;

        return new Salad(name, price, rand.nextBoolean(), rand.nextBoolean());
    }
    public static Soup getSoupExample(){
        String name = soupNames[rand.nextInt(soupNames.length)];
        double price = rand.nextInt(6) + 3.99;
        
        return new Soup(name, price, rand.nextBoolean(), rand.nextBoolean());
    }
    public static SoftDrink getSoftDrinkNames(){
        String name = softDrinkNames[rand.nextInt(softDrinkNames.length)];
        double price = rand.nextInt(7) + 1.99;
        char size = sizes[rand.nextInt(sizes.length)];
        
        return new SoftDrink(name, price, size, rand.nextBoolean());
    }
    public static Alcohol getAlcoholNames(){
        String name = alcoholNames[rand.nextInt(alcoholNames.length)];
        double price = rand.nextInt(16) + 2.99;
        char size = sizes[rand.nextInt(sizes.length)];
        int proof = rand.nextInt(75);
                
        return new Alcohol(name, price, size, proof);
        
    }
    
}
