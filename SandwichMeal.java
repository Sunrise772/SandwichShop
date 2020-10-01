/**
 * Program to Test different menu options
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package mini09;

public class SandwichMeal extends Sandwich {
    String side;
    double sidePrice;
    
    public SandwichMeal() {
        meat = "";
        bread = "";
        price = 0;
        side = "";
        sidePrice = 0;
    }
    
    public SandwichMeal (String meat, String bread, double price, String side, double sidePrice) {
        this.meat = meat;
        this.bread = bread;
        this.price = price;
        this.side = side;
        this.sidePrice = sidePrice;
    }    
    
    public String getSide() {
        return side;
    }    
    
    @Override
    public double getPrice() {
        return super.getPrice() - (super.getPrice() * .1) + sidePrice - (sidePrice *.1);
    }
    
    @Override
    public String toString() {
        return String.format("%s with %s", super.toString(), getSide());
    }
}
