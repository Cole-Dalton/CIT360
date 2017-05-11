package personalSandboxCode.threadsExecutablesRunnables;
import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by daltonsolo on 5/9/2017.
 */
public class ExecutorTask implements Runnable {
    public static PrintStream p = System.out;
    private int time;
    private String name;
    private Random r = new Random();

    public ExecutorTask(String name) {
        this.name = name;
        time = r.nextInt(999);
    }

    public String getName() {
        return name;
    }

    @Override
    // Thread creation
    public void run() {
        p.println("Current thread = " + Thread.currentThread().getName());
        try {
            p.println("Doing a task during : " + name);
            Thread.currentThread().sleep(time);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
