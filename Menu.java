/**
 * Program to Test different menu options
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package mini09;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // declare other necessary variables
        String meat;
        String bread;
        double price;
        String side;
        double sidePrice;
        
        // prompt the user for the meat, bread, ...
        System.out.println("Meat Bread Price? ");
        meat = input.next();
        bread = input.next();
        price = input.nextDouble();
        
        System.out.println("Side Price? ");
        side = input.next();
        sidePrice = input.nextDouble();
        
        // Create the s and sm objects (hint – use new)
        Sandwich s = new Sandwich(meat, bread, price);
        SandwichMeal sm = new SandwichMeal(meat, bread, price, side, sidePrice);
        
        // Print the results
        System.out.printf("%s --> $%.2f%n", s, s.getPrice());
        System.out.printf("%s --> $%.2f%n", sm, sm.getPrice());
    }    
}
