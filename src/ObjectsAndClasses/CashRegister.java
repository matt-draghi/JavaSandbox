package ObjectsAndClasses;

/**
 * A simulated cash register that tracks the item count and the total amount due
 */
public class CashRegister {
    //private data
    private int itemCount;
    private double totalPrice;

    //A constructor intializes the instance variables of an object
    //The constructor is automatically called whenever an object is created with the "new" operator
    /**
     * Constructs a cash register with cleared item count and total.
     */
    public CashRegister(){
        itemCount = 0;
        totalPrice = 0;

        //Constructors never return values, but you do not use the void reserved word when declaring them
    }

    //Classes can have more than one constructor - allowing you to declare objects in different ways
    /*
    Ex.
    public CashRegister(double stateTax){...}
     */

    /**
     * Adds an item to this cash register.
     *
     * @param price the price of this item
     */
    public void addItem(double price) {
        //implementation
        itemCount++;
        totalPrice += price;
    }

    /**
     * Gets the price of all items in the current sale
     *
     * @return the total price
     */
    public double getTotal() {
        //implementation
        return totalPrice;
    }

    /**
     * Gets the number of items in the current sale.
     *
     * @return the item count
     */
    public int getCount() {
        //implementation
        return itemCount;
    }

    /**
     * Clears the item count and the total
     */
    public void clear() {
        //implementation
        itemCount = 0;
        totalPrice = 0;
    }

    //The method declarations and comments make up the public interface of the class
    //The data and the method bodies make up the private implementation of the class

    /*
      Notice that the methods of the CashRegister class are instance methods - they are NOT delcared as static
      since you invoke them on objects (or instances) of the CashRegister class
    */
}