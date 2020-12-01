/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package snackBar;

import java.text.DecimalFormat;

public class Main
{
    public static void workingWithData()
    {
        // customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // snacks for food vending machine
        Snack chips = new Snack("Chips", 36, 1.75, food.getId(), food.getName());
        Snack choco = new Snack("Chocolate Bar", 36, 1.00, food.getId(), food.getName());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId(), food.getName());

        // snacks for drink vending machine
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId(), drink.getName());
        Snack water = new Snack("Water", 20, 2.75, drink.getId(), drink.getName());

        // stretch - dollar amount formatter
        DecimalFormat df = new DecimalFormat("$###,###.00");
        
        // 1st action
        soda.buySnack(3);
        jane.buySnack(soda.getTotalCost(3));
        
        // update on customer's `cashOnHand` and snack's `quanity`
        System.out.println(customerPretext(jane.getName()) + df.format(jane.getCashOnHand()));
        System.out.println(snackPretext(soda.getName()) + soda.getQuantity()); 

        // 2nd action
        pretzel.buySnack(1);
        jane.buySnack(pretzel.getTotalCost(1));

        // update on customer's `cashOnHand` and snack's `quanity`
        System.out.println(customerPretext(jane.getName()) + df.format(jane.getCashOnHand()));
        System.out.println(snackPretext(pretzel.getName()) + pretzel.getQuantity());

        // 3rd action
        soda.buySnack(2);
        bob.buySnack(soda.getTotalCost(2));

        // update on customer's `cashOnHand` and snack's `quanity`
        System.out.println(customerPretext(bob.getName()) + df.format(bob.getCashOnHand()));
        System.out.println(snackPretext(soda.getName()) + soda.getQuantity());

        // 4th action and update on customer's `cashOnHand`
        jane.addToCashOnHand(10);
        System.out.println(customerPretext(jane.getName()) + df.format(jane.getCashOnHand()));

        // 5th action
        choco.buySnack(1);
        jane.buySnack(choco.getTotalCost(1));
        
        // update on customer's `cashOnHand` and snack's `quanity`
        System.out.println(customerPretext(jane.getName()) + df.format(jane.getCashOnHand()));
        System.out.println(snackPretext(choco.getName()) + choco.getQuantity());

        // 6th action and update on snack's `quantity`
        pretzel.addToQuantity(12);
        System.out.println(snackPretext(pretzel.getName() + pretzel.getQuantity()));

        // 7th action
        pretzel.buySnack(3);
        bob.buySnack(pretzel.getTotalCost(3));

        // update on customer's `cashOnHand` and snack's `quanity`
        System.out.println(customerPretext(bob.getName()) + df.format(bob.getCashOnHand()));
        System.out.println(snackPretext(pretzel.getName()) + pretzel.getQuantity());

        // stretch - toString override
        System.out.println(chips);
        System.out.println(choco);
        System.out.println(pretzel);
        System.out.println(soda);
        System.out.println(water);
    }

    public static String customerPretext(String customer)
    {
        return customer + "'s cash on hand: ";
    }

    public static String snackPretext(String snack)
    {
        return "Quantity of " + snack + ": ";
    }

    public static void main(String[] args)
    {
        workingWithData();
    }
}
