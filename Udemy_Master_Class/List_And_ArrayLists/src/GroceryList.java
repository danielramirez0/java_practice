import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findIndex(oldItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item) {
        int position = findIndex(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        if (exists) {
            int position = groceryList.indexOf(searchItem);
//            if (position >=0)
            return groceryList.get(position);
        }
        return null;

    }

    private int findIndex(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int pos = findIndex(searchItem);
        if (pos >= 0) {
            return true;
        } else {
            return false;
        }

    }


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
