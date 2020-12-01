/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package snackBar;

import java.text.DecimalFormat;

public class Customer
{
    // fields
    private static int maxId = 1;
    private int id;
    private String name;
    private double cashOnHand;

    // constructor
    public Customer(String name, double cashOnHand)
    {
        id = maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    
    // getters and setters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        String nameCopy = this.name;
        this.name = name;
        System.out.println("Name changed from " + nameCopy + " to " + name);
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }


    // methods
    public void addToCashOnHand(double cash)
    {
        this.cashOnHand += cash;
        System.out.println("Added $" + cash + ". Cash on hand: $" + cashOnHand);
    }

    public void buySnack(double totalCost)
    {
        this.cashOnHand -= totalCost;
        System.out.println("Bought $" + totalCost + " worth of snacks. Cash on hand: $" + cashOnHand);
    }
}
