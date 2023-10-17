public class MyThread extends Thread {
    @Override
    public void run() {
        // This method is executed when the thread is started
        for (int i = 10; i > 0; i--) {
            // Print a message indicating the current iteration
            System.out.println("Thread #1 : " + i);
            try {
                // Put the thread to sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // If an interruption occurs, throw a RuntimeException with the exception
                throw new RuntimeException(e);
            }
        }
        // This message is printed when the loop is finished
        System.out.println("Thread #1 is finished");
    }
}
