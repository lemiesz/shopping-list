import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    private java.util.Scanner scan;
    // declare storage for the list items
    String list[];
    int counter;

    public ShoppingList() {
        scan = new java.util.Scanner(System.in);
        // initialize storage for list items
        // set counter to zero
        counter = 0;
        list = new String[10];

    }

    public void printList() {

        System.out.println("Your shopping list:");
        // print the list
        // if nothing in the list, print empty
        if (counter == 0) {
            System.out.println("empty");
        }
        int i;
        // if list has less than 10 items, print the items
        for (i = 0; i < 10; i++)
            ;
        {
            System.out.println((i + 1) + list[i]);

            /*
             * or maybe?? i = 0; if (list[i] != null) ; System.out.println(list[i] + i++);
             */
        }
    }

    public void addToList(String item) {
        // add item to the list
        int i;
        for (i = 0; i < counter; i++)
            ;
        {
            list[i] = item;
            counter++;
            // addToList(item);
        }
    }

    public void emptyList() {
        // reinitialize so list is zero
        list[10] = null;
        System.out.println("nothing in the list");
        // empty the list
    }

    public String getInput() {
        System.out.print("Enter your item or command: ");
        return scan.next().trim();

    }

    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }

    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }

    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p : Print the list");
        System.out.println("  -e : Empty the list");
        // System.out.println(" -r n : Remove the nth item from the list");
        // System.out.println(" -r Xxx : Remove item Xxx from the list");
        System.out.println("  -x : Exit the application");
        System.out.println("  -h : Print this command list");
    }

    public void go() {
        String input;

        printWelcome();
        printHelp();
        input = getInput();
        while (!input.equals("-x")) {
            switch (input) {
            case "-h":
                printHelp();
                break;
            case "-p":
                printList();
                break;
            case "-x":
                break;
            case "-e":
                emptyList();
                break;
            default:
                addToList(input);
            }
            /*
             * alternate (pre-Java 1.7) implementation if(input.equals("-h")) { printHelp();
             * } else if(input.equals("-p")) { printList(); } else if(input.equals("-e")) {
             * emptyList(); } else { addToList(input); } //
             */
            input = getInput();
        }
        printThankYou();
    }

    public static void main(String[] args) {
        ShoppingList list;

        list = new ShoppingList();
        list.go();
        // list.testList();

        ;
    }

}
