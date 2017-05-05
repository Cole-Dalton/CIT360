package personalSandboxCode.threadsExecutablesRunnables;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by daltonsolo on 5/4/2017.
 */

/*
    This is class is going to demonstrate the use of threads.
    I will create 3 different objects, each running on a separate thread.
    Each object will have a String called name, and an int called time, then
    a Random called r to be able to assign a random time.
 */

// Runnable is an interface that contains the run() method and allows for threading.
public class Salmon implements Runnable {
    String name;
    int time;
    Random r = new Random();

    // Constructor
    public Salmon(String x){
        name = x;
        // Time to sleep (when you put a thread to sleep, it essentially tells the thread to "do nothing")
        // Gives the sleep time a random number between 0 and 999 milliseconds.
        time = r.nextInt(999);

    }
    // Creates run method. Run method is called whenever thread is started.

    public void run(){
        PrintStream p = System.out;
        // This is the code that actually gets run whenever the thread is started.
        try{
            // %s = string, $s = decimal?
            p.printf("%s is sleeping for %d\n", name, time);
            /*
            Put the thread to bed. Lol
            Time = how long you want the thread to sleep for.
            Remember the time is randomized.
            */
            Thread.sleep(time);
            p.printf("%s woke up from its sleep\n", name);

        }catch(Exception e){}
    }
}
