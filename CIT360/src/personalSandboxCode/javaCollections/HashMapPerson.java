package personalSandboxCode.javaCollections;

/**
 * Created by daltonsolo on 5/6/2017.
 */
public class HashMapPerson {
    // Variables
    private String firstName;
    private String lastName;
    private int age;
    private String education;
    private String position;
    // Constructor function
    public HashMapPerson(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }
    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
