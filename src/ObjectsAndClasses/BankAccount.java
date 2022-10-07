package ObjectsAndClasses;

public class BankAccount {
    private double balance;
    private int accountNumber;

    //like instance variables, static variables should be private to prevent other classes from changing its value
    private static int lastAssignedNumber = 1000; //static is used to specify that a value belongs to a class - not a specific instance
    public static final double OVERDRAFT_FEE = 29.95; //static constants can be either private or public

    public BankAccount(){
        lastAssignedNumber++;
        accountNumber =  lastAssignedNumber;
    }


}
