package personalSandboxCode.javaCollections;

import java.io.PrintStream;
import java.util.*;
/**
 * Created by daltonsolo on 5/6/2017.
 */
public class HashMapMain {
    // Create the HashMap with a string
    static HashMap<String, String> departmentMap = new HashMap<>();
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
    }
}
