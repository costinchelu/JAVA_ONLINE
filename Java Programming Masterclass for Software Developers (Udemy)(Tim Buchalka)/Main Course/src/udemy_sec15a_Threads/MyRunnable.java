package udemy_sec15a_Threads;

import static udemy_sec15a_Threads.ThreadColor.ANSI_CYAN;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Hello from MyRunnable's implementation of run!");
    }
}

// using Runnable interface