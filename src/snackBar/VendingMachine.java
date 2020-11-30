/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package snackBar;

public class VendingMachine
{
    // fields
    private static int maxId = 1;
    private int id;
    private String name;

    // constructor
    public VendingMachine(String name)
    {
        id = maxId++;
        this.name = name;
    }

    // getter and setters
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
        System.out.println("Changed name from " + nameCopy + " to " + name);
    }
}
