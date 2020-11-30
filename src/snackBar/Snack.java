/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package snackBar;

public class Snack
{
    // fields
    private static int maxId = 1;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        this.id = maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    // methods
    public void addToQuantity(int quantity)
    {
        this.quantity += quantity;
        System.out.println("Added " + quantity + " to " + name + ". Now is " + this.quantity);
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
        System.out.println("Bought " + quantity + " of " + name + " for $" + (cost * quantity));
    }

    public double getTotalCost(int quantity)
    {
        return cost * quantity;
    }
}
