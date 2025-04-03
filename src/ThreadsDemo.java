public class ThreadsDemo extends Thread {

    @Override
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadsDemo t1 = new ThreadsDemo();
        t1.start();

        //Thread.sleep(200);
    }

}
