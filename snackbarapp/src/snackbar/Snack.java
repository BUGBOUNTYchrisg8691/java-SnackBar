/**
 * @author : chrisg
 * @created : 2020-11-29
**/

package snackbar;

import java.text.DecimalFormat;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    public int vendingMachineId;
    public String vendingMachineName;

    public Snack(String name, int quantity, double cost, int vendingMachineId, String vendingMachineName)
    {
        this.id = maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
        this.vendingMachineName = vendingMachineName;
    }

    public void displayInfo()
    {
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.println("Name: " + name + "\nVending Machine Name: " + vendingMachineName + "\nQuantity: " + quantity + "\nTotal Price: $" + df.format(getTotalCost(quantity)));
    }

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

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int id)
    {
        this.vendingMachineId = id;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addToQuantity(int amount)
    {
        this.quantity += amount;
    }

    public double getTotalCost(int amount)
    {
        this.quantity -= amount;
        return cost * amount;
    }
}
