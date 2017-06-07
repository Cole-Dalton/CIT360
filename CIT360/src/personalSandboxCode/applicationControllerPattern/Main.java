package personalSandboxCode.applicationControllerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daltonsolo on 6/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationController controller = new ApplicationController();
        // The fish that are in my imaginary river
        String fish1 = "Rainbow Trout";
        String fish2 = "Salmon";
        // I decided to use an ArrayList here to try and go above basic familiarity with Java Collections
        List<String> numFish = new ArrayList<>();
        // Initialize command
        String command;

        Scanner in = new Scanner(System.in);
        for(int i = 0; i <= 5; i++) {
            // Get user input for the command
            System.out.println("Would you like to catch or release a fish? (Type either 'catch' or 'release')");
            command = in.nextLine();

            // Pass data to Application Controller handleCommands method
            controller.handleCommands(command,fish1,fish2,numFish);
        }
    }
}
