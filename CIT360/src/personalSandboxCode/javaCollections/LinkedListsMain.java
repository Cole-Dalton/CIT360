package personalSandboxCode.javaCollections;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by daltonsolo on 5/3/2017.
 * This class is the Main class for the LinkedLists demonstration
 */
public class LinkedListsMain {
    public static void main(String[] args) {
        // Make printing easy
        PrintStream p = System.out;
        // Create new customers from LinkedListsCustomer class
        LinkedListsCustomer customer = new LinkedListsCustomer("Dalton", 77.77);
        LinkedListsCustomer customerTwo;
        // Set customerTwo to the customer class
        customerTwo = customer;
        // Set customerTwo balance to 19.92
        customerTwo.setBalance(19.92);
        /*
        When the output of this statement prints, you'll notice that customer also got
        the balance changed. This is because the line of code that states
        "customerTwo = customer" is really just making customerTwo point to the customer
        class (since it is a LinkedList) which will cause any changes made to customerTwo
         to be applied to the customer class.
        */
        p.println("The balance for customer " + customerTwo.getName() + " is " + customerTwo.getBalance()
                  + "\nThe balance for " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);
        /*
          This for loop will print the index number on the left side of the
          colon, and the integer that resides at that index number on the right
         */
        for(int i=0;i<intList.size(); i++) {
            p.println(i + ": " + intList.get(i));
        }
        // Inserts the number 2 at index position 1 (the second element)
        intList.add(1, 2);
        // Prints it once more to show the change. The number 2 will now be at index 1.
        for(int i=0;i<intList.size(); i++) {
            p.println(i + ": " + intList.get(i));
        }

    }
}
