package personalSandboxCode.applicationControllerPattern;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashMap;
import java.util.List;

/**
 * Created by daltonsolo on 6/3/2017.
 */
public class ApplicationController {
    public static HashMap<String, Handler> commandMap = new HashMap<String, Handler>();

    public void ApplicationController() {

    }

    public static void handleCommands(String command, String fish1, String fish2, List<String> numFish) {
        commandMap.put("catch", new CatchFish());
        commandMap.put("release", new ReleaseFish());

        Handler handler = commandMap.get(command);
        handler.exe(fish1, fish2, numFish);
    }
}
