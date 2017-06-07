package personalSandboxCode.applicationControllerPattern;

import java.util.List;

/**
 * Created by daltonsolo on 6/3/2017.
 */

// This is the interface all the "Command" classes impmlement
public interface Handler {
    void exe(String fish1, String fish2, List<String> numFish);
}
