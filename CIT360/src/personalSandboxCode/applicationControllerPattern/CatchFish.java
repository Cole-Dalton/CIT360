package personalSandboxCode.applicationControllerPattern;


import java.util.List;

/**
 * Created by daltonsolo on 6/3/2017.
 */

// This class contains all the code that executes when a user enters the "catch" command
public class CatchFish implements Handler {
    // Execute method from Handler interface
    public void exe(String fish1, String fish2, List<String> numFish) {
        // Generates random number between 0 and 1 to decide if you catch a fish (equal probability of both)
        int caughtDecider = (Math.random() <= 0.5) ? 0 : 1;
        // random between 2 and 3 to decide which fish you'll catch
        int fishDecider = (Math.random() <= 0.5) ? 2 : 3;
        // If 0, you didn't catch any fish.
        if(caughtDecider == 0) {
            System.out.println("You did not catch a fish");
            System.out.println("You now have " + numFish.size() + " fish.");
        }
        // If 1, you caught a fish, decided by the fishDecider
        else if(caughtDecider == 1) {
            // If it's 2, you caught fish1
            if(fishDecider == 2) {
                // Add fish1 to array
                numFish.add(fish1);
                System.out.println("You caught some " + fish1 + "! Nice job.");
                System.out.println("You now have " + numFish.size() + " fish.");
            }
            // If it's 3, you caught fish2
            else if(fishDecider == 3) {
                // add fish2 to array
                numFish.add(fish2);
                System.out.println("You caught some " + fish2 + "! Nice job.");
                System.out.println("You now have " + numFish.size() + " fish.");
            }
            else{
                System.out.println("The fishDecider code isn't working properly.");
            }
        }
        else {
            System.out.println("The caughtDecider code isn't working properly.");
        }

    }
}
