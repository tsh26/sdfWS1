   
import java.util.ArrayList;
import java.util.Scanner;

public class shoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //initialize an empty list called "cart"
        ArrayList<String> cart = new ArrayList<>();

        System.out.println("Welcome to your shopping cart");

        while (true) {
            System.out.println(">");
            String input = scanner.nextLine();

            if (input.equals("list")) {
                listItem(cart);
            }

            if (input.startsWith("add ")) {
                addItems(cart, input.substring(4));
            }
            
            if (input.startsWith("delete ")) {
                removeItem(cart, input.substring(7));

            }
        }

    }

    // method for listing contents of shopping cart
    public static void listItem(ArrayList<String> cart) {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i+1) + ". " + cart.get(i));
            }
        }
    }

    // method for adding items into cart
    public static void addItems(ArrayList<String> cart, String items) {
        //
        String[] itemArray = items.split(", ");
        
        for (String item: itemArray) {
            if (cart.contains(items)) {
                System.out.println("You have " + item + " in your cart");
            } else {
                cart.add(item);
                System.out.println(item + " added to cart");
            }
        }
    }

    // method for removing items from cart
    public static void removeItem(ArrayList<String> cart, String indexStr) {
        //change input String number to int number.
        int index = Integer.parseInt(indexStr);

        if (index >= 0 && index < cart.size()) {
            String removedItem = cart.remove(index-1);
            System.out.println(removedItem + " removed from cart");

        } else {
            System.out.println("Incorrect item index.");
        }
    }
    

}
