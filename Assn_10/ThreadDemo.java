/*
 * In this assignment we have made a simple program to test the various methods of the thread class in java.
 * We have extended the thread class.
 * */

package Assn_10;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo myThread = new ThreadDemo();
        myThread.start(); // start the thread

        System.out.println("Thread name: " + myThread.getName()); // get thread name
        System.out.println("Thread priority: " + myThread.getPriority()); // get thread priority
        System.out.println("Thread ID: " + myThread.threadId()); // get thread ID
        System.out.println("Is thread alive? " + myThread.isAlive()); // check if thread is alive

        try {
            myThread.join(); // wait for the thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread has finished.");
    }

    public void run() {
        System.out.println("Thread is running.");
    }
}
