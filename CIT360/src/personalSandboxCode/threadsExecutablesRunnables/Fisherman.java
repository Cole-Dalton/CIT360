package personalSandboxCode.threadsExecutablesRunnables;

/**
 * Created by daltonsolo on 5/4/2017.
 */
public class Fisherman {
    public static void main(String[] args) {
        /*
        We're going to create the thread here.
        You can't implement a class in here if you don't
        have it implementing "runnable".
        Remember that x = name in the Salmon constructor.
        */
        Thread t1 = new Thread(new Salmon("one"));
        /*
        Basically what this code does is create a thread object called
        t1 from the class Salmon, which gives it a name and random time
        then puts it to sleep.
        */

        /*
        This creates 3 more threads, based off of the Salmon class,
        and names them using x from the constructor function argument
        in the Salmon class.
        */
        Thread t2 = new Thread(new Salmon("two"));
        Thread t3 = new Thread(new Salmon("three"));
        Thread t4 = new Thread(new Salmon("four"));
        /*
        This is how you start a thread. The other threads have not been started yet.
        Start essentially calls the run() method.
        */
        t1.start();
        // Start other threads.
        t2.start();
        t3.start();
        t4.start();
        /* The output of running this so far will be shown in a random order,
           and that's because they all executed at once so there isn't really
           an order to put them in, with the exception of the statements saying
           when the thread has woken up, which will be shown in the order of the
           threads which have the shortest sleep time (because the statement is printed
           right after the thread "wakes up".
         */

    }
}
