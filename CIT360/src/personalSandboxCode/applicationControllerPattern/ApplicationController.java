package personalSandboxCode.applicationControllerPattern;

import java.util.HashMap;
import java.util.List;

/**
 * Created by daltonsolo on 6/3/2017.
 */
public class ApplicationController {
    // Create HashMap for commands
    public static HashMap<String, Handler> commandMap = new HashMap<String, Handler>();

    public void ApplicationController() {

    }
    // This method adds some of the commands to the HashMap and executes the method in the Handler interface with the
    // data provided by the user and the Main class
    public static void handleCommands(String command, String fish1, String fish2, List<String> numFish) {
        commandMap.put("catch", new CatchFish());
        commandMap.put("release", new ReleaseFish());

        Handler handler = commandMap.get(command);
        // Execute method in interface using user's command (either CatchFish or ReleaseFish will execute
        handler.exe(fish1, fish2, numFish);
    }
}
