package personalSandboxCode.javaCollections;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by daltonsolo on 5/5/2017.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        PrintStream p = System.out;
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Newport");
        placesToVisit.add("Portland");
        placesToVisit.add("Albany");
        placesToVisit.add("Salem");
        placesToVisit.add("Lincoln City");
        placesToVisit.add("Oceanside");

        printList(placesToVisit);
        /* The way LinkedLists work when adding elements is elements
           don't get pushed up a position in actual memory, the new element just
           gets saved in memory and the element before it now points to
           the new one in memory instead of the one that it did before, and
           the element after the new one gets pointed to by the new element.
           When removing however, the element before the removed element
           will now point to the one that the removed one did.
           So, by adding Bend here, Newport now points to Bend instead of
           Portland. By removing Salem afterwards, Albany now points to Lincoln
           City. You can't refer to a specific index like you can with
           ArrayLists. You use Iterators to go through the list but can't specifically
           pick out items.
         */
        p.println("Add Bend to index 1: \n");
        placesToVisit.add(1, "Bend");
        printList(placesToVisit);
        p.println("Remove index 4\n");
        placesToVisit.remove(4);
        printList(placesToVisit);
        p.println("This next one will be using the pop method\n");
        /*
        Pop will remove the first item in the list, sort of like
        popping something off the top of a stack. In this case it will
        pop Newport, which is at index 0
        */
        placesToVisit.pop();
        printList(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList) {
        PrintStream p = System.out;
        /*
        Creates an iterator, this is setting up for
        the equivalent of a for loop
        */
        Iterator<String> i = linkedList.iterator();
        // While there is another entry in the list, do this
            while (i.hasNext()) {
                /*
                This loop will iterate through the LinkedList
                and print Now Visiting whenever there is something
                next in the list, as if it was travelling
                */
                /*
                This difference between hasNext() and next() is that
                hasNext() asks "Is there another entry?" and next() actually
                moves to the next entry after outputting the current state
                */
                p.println("Now visiting " + i.next() + "\n");
            }
            p.println("-----------------------------------------------");
    }
}
