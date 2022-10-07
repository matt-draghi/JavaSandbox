package ObjectsAndClasses;

public class ObjectsAndClasses {

    public static void MainMethodForClass(){
        //Public Interface - the set of all methods provided by a class, together with a description of their behavior
            //Every class has a public interface - a collection of methods through which the objects of the class can be manipulated

        //Encapsulation - the process of providing a public interface, while hiding the implementation details
            //Encapsulation enables changes in the implementation without affecting users of a class - think using a steering wheel and pedals to drive a car without knowing how the engine works

        CashRegister register1 = new CashRegister();
        //constructs a CashRegister object

        register1.addItem(1.95);
        register1.addItem(0.95);
        register1.addItem(2.50);
        System.out.print(register1.getCount() + " item(s) costing $");
        System.out.printf("%.2f\n", register1.getTotal());

    }

    /*
     *Instance variables - a variable that is designated to one particular instance of an object
     * An instance variable declaration consists of the following parts:
     * - An modifier (private - instance variables should always be private)
     * - The type of the instance variable (such as int)
     * - the name of the instance variable (such as value)
     */

    private int value;

    //Note how the instance variable is not defined inside a method - just the class; Main.java cannot access this variable



}
