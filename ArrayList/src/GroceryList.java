import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);      //add to the array list
    }

    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size(); i++)     //gets the size of the array list
        {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
public void modifyGroceryItem(String currentItem,String newItem)
{
int position = findItem(currentItem);
if(position>=0)
{
    modifyGroceryItem(position, newItem);
}
}
    private void modifyGroceryItem(int position, String newItem)
    {
        groceryList.set(position, newItem); //modify the item in list
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item)
    {
        int position = findItem(item);
        if(position>=0)
        {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position)
    {
       // String theItem = groceryList.get(position);
        groceryList.remove(position);       //to remove item from list
    }

    private int findItem(String searchItem)
    {
       // boolean exists = groceryList.contains(searchItem);
       return groceryList.indexOf(searchItem); //search the position of item
    }
    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        if(position>=0)
        {
            return true;
        }
        else
            return false;
    }
}
