/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package snackBar;

import java.text.DecimalFormat;

public class Snack
{
    // fields
    private static int maxId = 1;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    private String vendingMachineName;

    // stretch - cost formatter
    DecimalFormat df = new DecimalFormat("$###,###.00");

    // constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId, String vendingMachineName)
    {
        this.id = maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
        this.vendingMachineName = vendingMachineName;
    }

    // stretch - toString override
    @Override
    public String toString()
    {
        return "Snack: " + name + "\nVending Machine Name: " + vendingMachineName + "\nQuantity: " + quantity + "\nTotalCost: " + df.format(cost * quantity);
    }

    // Getters and Setters
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
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public String getVendingMachineName()
    {
        return vendingMachineName;
    }

    public void setVendingMachineName(String vendingMachineName)
    {
        this.vendingMachineName = vendingMachineName;
    }

    // methods
    public void addToQuantity(int quantity)
    {
        this.quantity += quantity;
        System.out.println("Added " + quantity + " to " + name + ". Now is " + this.quantity);
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
        System.out.println("Bought " + quantity + " of " + name + " for " + df.format(cost * quantity));
    }

    public double getTotalCost(int quantity)
    {
        return cost * quantity;
    }
}
