package personalSandboxCode.javaCollections;
import	java.util.*;
import static java.util.Collections.*;


public class javaCollectionsCode {

	public static void main(String[] args) {
		String[] stuff = {"strawberries", "blueberries", "blackberries", "raspberries"};
		List<String> list1 = new ArrayList<>();

		// Put array items into the list
		addAll(list1, stuff);

		String[] moreStuff = {"apples", "oranges", "strawberries", "blueberries"};
		List<String> list2 = new ArrayList<>();

		addAll(list2, moreStuff);

        for(int i = 0;i<list2.size();i++) {
            // Print format, loop through list 2, %s = %string (with a space)
            // get(i) references the item in the list
            System.out.printf("%s ", list2.get(i));
        }
	}

}