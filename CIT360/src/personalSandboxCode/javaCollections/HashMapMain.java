package personalSandboxCode.javaCollections;

import java.io.PrintStream;
import java.util.*;
/**
 * Created by daltonsolo on 5/6/2017.
 */
public class HashMapMain {
    // Create the HashMap with String values and keys
    static HashMap<String, String> departmentMap = new HashMap<>();
    // Create TreeMap using Integer key and String value
    static TreeMap<Integer, String> favoriteFoods = new TreeMap<Integer, String>();
    public static void main(String[] args) {
        PrintStream p = System.out;
        HashMapPerson p1 = new HashMapPerson("Dalton", "Cole", "Tech Support");
        HashMapPerson p2 = new HashMapPerson("Robert", "Fredrickson","Janitor");
        HashMapPerson p3 = new HashMapPerson("Brother", "Tucket", "Professor");
        // These statements add keys and corresponding values to the map.
        // In this case, we are creating a map of departments for an organization (a school)
        // in which we have 1 person from IT, 1 person from Custodial, and 1 person from Education.
        // After doing this, one can search by the key values (the departments) to see who is in which department.
        departmentMap.put("IT", p1.getFirstName() + " " + p1.getLastName() + " Position : " + p1.getPosition());
        departmentMap.put("Custodial", p2.getFirstName() + " " + p2.getLastName() + " Position : " + p2.getPosition());
        departmentMap.put("Education", p3.getFirstName() + " " + p3.getLastName() + " Position : " + p3.getPosition());

        p.println(departmentMap);
        // Can use specific keys to get the value like so:
        p.println("---------------------------------\nWho is in IT? ----> " + departmentMap.get("IT"));

        // TreeMap examples

        // Add stuff to the map. The difference between a TreeMap and a HashMap is that a TreeMap is ordered.
        favoriteFoods.put(1, "Pizza");
        favoriteFoods.put(2, "Spaghetti");
        favoriteFoods.put(3, "Peanut Soup");
        favoriteFoods.put(4, "Orange Chicken");
        favoriteFoods.put(5, "Potatoes");
        p.println("----------------------------------------------------------\nTreeMap\n----------------------------------------------------------\n");
        p.println(favoriteFoods);
        // To print my first favorite food, I'll use the firstKey() method.
        p.println("My all time favorite food is " + favoriteFoods.get(favoriteFoods.firstKey()));
        // To print the last one, I'll use lastKey().
        p.println("My least favorite food is " + favoriteFoods.get(favoriteFoods.lastKey()));
        // I can also print the keys in descending order:
        p.println(favoriteFoods.descendingMap());


    }
}
