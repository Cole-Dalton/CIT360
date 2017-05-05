package personalSandboxCode.javaCollections;
import java.io.PrintStream;
import	java.util.*;
import static java.util.Collections.*;


public class ArrayLists {

	public static void main(String[] args) {
		// Makes printing easier
		PrintStream out = System.out;
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
			out.printf("%s ", list1.get(i));
		}
		// Print a new line to separate output
		out.println("\n");


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
        for(int i = 0;i<list2.size();i++) out.printf("%s ", list2.get(i));
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
        out.println("\n");
        for(int i = 0;i<list2.size();i++) out.printf("%s ", list2.get(i));

        // Uses editList method and takes list1 and list2 as arguments
		editList(list1,list2);
        out.println("\nThe following line is the result of the editList method");
		// Prints results of list after editList method is executed.
		for (String aList1 : list1) out.printf("%s ", aList1);



	}
	/*
	Adds a method called editList that will go through the lists using an Iterator object
	and take out all the matching Strings in list1 from list2
	*/

    public static void editList(Collection<String> l1, Collection<String> l2) {
		PrintStream out = System.out;
		// Creates an Iterator object to loop through each item.
		Iterator<String> it = l1.iterator();
		/*
		Loops through until the end of the list.
		A good way to think of hasNext is that it loops as long as it
		*has* something *next* to go to.
		*/
		while(it.hasNext()) {
			/*
			If list2 contains any matching items,
			remove it. (Iterates through entire list)
			*/
            if(l2.contains(it.next()))
				it.remove();
		}
		out.println();

	}
}
