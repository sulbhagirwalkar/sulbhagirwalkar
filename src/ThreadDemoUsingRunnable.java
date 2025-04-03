public class ThreadDemoUsingRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ThreadDemoUsingRunnable runnableInstance = new ThreadDemoUsingRunnable();
        Thread thread = new Thread(runnableInstance);
        try {
            System.out.println("thread is sleeping");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();

    }
}
