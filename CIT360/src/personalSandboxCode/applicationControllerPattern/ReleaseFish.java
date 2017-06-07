package personalSandboxCode.applicationControllerPattern;


import java.util.List;

/**
 * Created by daltonsolo on 6/3/2017.
 */

public class ReleaseFish implements Handler {
    public void exe(String fish1, String fish2, List<String> numFish) {
        if(numFish.size() > 0) {
            numFish.remove(numFish.size() - 1);
            System.out.println("You released a fish, and now you have " + numFish.size() + " fish.");
        }
        else {
            System.out.println("You can't release any fish if you don't have any!");
        }
    }
}