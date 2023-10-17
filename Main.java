public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Create a new thread using the MyThread class
        MyThread thread1 = new MyThread();

        // Create a new thread using the MyRunnable class
        MyRunnable runnable1 = new MyRunnable();
        // Wrap the MyRunnable instance in a Thread
        Thread thread2 = new Thread(runnable1);

        // Start thread1, which runs concurrently with the main thread
        thread1.start();
        // Join means that once thread1 is dead, thread 2 will start, waits 3 seconds before thread 2 starts
        thread1.join(3000);
        // Start thread2
        thread2.start();

        // If an exception is thrown in one thread, the others will keep running
        // Uncommenting the line below will result in an exception
        // System.out.println(+1/0);
    }
}
