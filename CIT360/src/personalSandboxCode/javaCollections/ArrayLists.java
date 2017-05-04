package personalSandboxCode.javaCollections;
import	java.util.*;
import static java.util.Collections.*;


public class ArrayLists {

	public static void main(String[] args) {
/* -------------------------------------------------------------------------------------
------------------------ First ArrayList -----------------------------------------------
----------------------------------------------------------------------------------------
*/
		// This creates a String Array, and populates it with some strings.
		String[] stuff = {"strawberries", "blueberries", "blackberries", "raspberries"};
		// This creates an ArrayList (a type of collection)
		List<String> list1 = new ArrayList<>();

		// Puts all String array items into the ArrayList
		addAll(list1, stuff);
        /* Loops through ArrayList list1 and prints each item in the list,
		   formatting the output to print as a string with a space in between the words.
		*/
		for(int i=0; i<list1.size();i++) {
			System.out.printf("%s ", list1.get(i));
		}
		// Print a new line to separate output
		System.out.println("\n");

/* ------------------------------------------------------------------------------
------------------------ Second ArrayList ---------------------------------------
---------------------------------------------------------------------------------
*/
        // Creates a second String list called moreStuff, adds some strings
		String[] moreStuff = {"apples", "oranges", "strawberries", "blueberries"};
		// Creates an ArrayList called list2
		List<String> list2 = new ArrayList<>();
        // adds all Strings from moreStuff to list2
		addAll(list2, moreStuff);
        /* Loops through ArrayList list1 and prints each item in the list,
		   formatting the output to print as a string with a space in between the words.
		*/
        for(int i = 0;i<list2.size();i++) {
            System.out.printf("%s ", list2.get(i));
        }
        /*
        Adds String to index [1] in the ArrayList, which is the second position (after [0])
        This moves "orange" to the right, which was originally at [1]
        */
        list2.add(1, "pears");
        /*
        Can also remove by the index. This will remove blueberries, because
        the code above will add an item first, pushing blueberries to index [4]
        */
        list2.remove(4);
        // Print new line
        System.out.println("\n");
        for(int i = 0;i<list2.size();i++) {
            System.out.printf("%s ", list2.get(i));
        }

	}
}
