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
        String fish1 = "Rainbow Trout";
        String fish2 = "Salmon";
        List<String> numFish = new ArrayList<>();
        String command;

        Scanner in = new Scanner(System.in);
        for(int i = 0; i <= 5; i++) {
            System.out.println("Would you like to catch or release a fish? (Type either 'catch' or 'release')");
            command = in.nextLine();

            controller.handleCommands(command,fish1,fish2,numFish);
        }
    }
}
