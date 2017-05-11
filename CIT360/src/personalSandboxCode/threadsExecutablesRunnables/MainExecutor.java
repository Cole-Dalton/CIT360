package personalSandboxCode.threadsExecutablesRunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by daltonsolo on 5/7/2017.
 */
public class MainExecutor {
    public static void main(String[] args) {
        /*
        Thread pools are basically managed sets of threads, and they reduce
        the overhead of *thread creation*. It handles the creation of new threads
        manually.

        An *executor* is responsible for the execution, instantiation, and running
        of threads using a thread pool. In the Executor interface, there is a sub-interface
        called ExecutorService. There is also a class called ThreadPoolExecutor which
        implements both the Executor and ExecutorService interfaces. This separates *task
        creation* and *execution*. So all we're doing here is implementing a(the) Runnable object(s)
        and having the executor do the execution for us, instead of creating *Thread objects* to execute
        them.
        */

        // Creates a thread pool with a limit of 5 threads that can be created.
        ThreadPoolExecutor exe1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for(int i=0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Gives thread stuff to do
            ExecutorTask task = new ExecutorTask("Task " + i);
            System.out.println("New task added: " + task.getName());
            exe1.execute(task);
        }
        //
        try {
            // Will shutdown after waiting for all tasks to finish up
            System.out.println("Attempt to shutdown executor");
            exe1.shutdown();
            exe1.awaitTermination(5, TimeUnit.SECONDS);
        }
        // If interrupted do this
        catch (InterruptedException e) {
            System.err.println("Tasks interrupted");
        }
        finally {
            // If there are tasks that aren't closing after shutdown() is used, force a shutdown
            if (!exe1.isTerminated()) {
                System.err.println("Shutting down all unfinished tasks");
            }
            // Forces shutdown
            exe1.shutdownNow();
            System.out.println("Completed shutdown");
        }



    }
}
