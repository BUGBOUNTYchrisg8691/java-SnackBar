/**
 * @author : chrisg
 * @created : 2020-11-29
**/

package snackbar;

import java.text.DecimalFormat;

public class Main
{
    private static void workWithData()
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("food");
        VendingMachine drink = new VendingMachine("drink");
        VendingMachine office = new VendingMachine("office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId(), food.getName());
        Snack choco = new Snack("Chocolate Bar", 36, 1.00, food.getId(), food.getName());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId(), food.getName());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId(), drink.getName());
        Snack water = new Snack("Water", 20, 2.75, drink.getId(), drink.getName());

        DecimalFormat df = new DecimalFormat("###,###.00");

        jane.buySnacks(soda.getTotalCost(3));
        System.out.println("Jane cash on hand $" + df.format(jane.getCashOnHand()));
        System.out.println("Quantity of soda is " + soda.getQuantity());

        jane.buySnacks(pretzel.getTotalCost(1));
        System.out.println("Jane cash on hand $" + df.format(jane.getCashOnHand()));
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

        bob.buySnacks(soda.getTotalCost(2));
        System.out.println("Bob cash on hand $" + df.format(bob.getCashOnHand()));
        System.out.println("Quantity of soda is " + soda.getQuantity());

        jane.addCash(10.00);
        System.out.println("Jane cash on hand $" + df.format(jane.getCashOnHand()));

        jane.buySnacks(choco.getTotalCost(1));
        System.out.println("Jane cash on hand $" + df.format(jane.getCashOnHand()));
        System.out.println("Quantity of chocolate is " + choco.getQuantity());

        pretzel.addToQuantity(10);
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

        bob.buySnacks(pretzel.getTotalCost(3));
        System.out.println("Bob cash on hand $" + df.format(bob.getCashOnHand()));
        System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

        chips.displayInfo();
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}
