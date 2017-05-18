package personalSandboxCode.threadsExecutablesRunnables;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by daltonsolo on 5/9/2017.
 */
public class ExecutorTask implements Runnable {
    public static PrintStream p = System.out;
    private int time;
    private String name;
    // For assigning a random sleep time.
    private Random r = new Random();

    public ExecutorTask(String name) {
        this.name = name;
        // creates random sleep time for thread
        time = r.nextInt(999);
    }

    public String getName() {
        return name;
    }

    @Override
    // Thread creation
    // Run method from the Runnable class.
    public void run() {
        // Prints name of the current thread
        p.println("Current thread = " + Thread.currentThread().getName());
        // Shows when a task is being executed concurrently with another thread,
        // then puts the thread to bed (I like saying that)
        try {
            p.println("Doing a task during : " + name);
            Thread.currentThread().sleep(time);
        }
        // Exception for when a thread is interrupted.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
