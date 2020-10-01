/**
 * Program to Test different menu options
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package mini09;

public class Sandwich {
    String meat;
    String bread;
    double price;
    
    public Sandwich() {
        meat = "";
        bread = "";
        price = 0;
    }
    
    public Sandwich(String meat, String bread, double price) {
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getMeat() {
        return meat;
    }
    
    public String getBread() {
        return bread;
    }
    
    
    public String toString() {
        return String.format("%s on %s", getMeat(), getBread());
    }
}