public class TheadClass {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println(Thread.activeCount());
        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().setName("MAINNNNN");
        // System.out.println(Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(1);
        // System.out.println(Thread.currentThread().isAlive());
        // for (int i = 3; i > 0; i--) {
        // System.out.println(i);
        // Thread.sleep(1000);
        // }

        // MyThread thread2 = new MyThread();
        // thread2.start();
        // thread2.setName("T-2");
        // System.out.println(thread2.isDaemon());
        // thread2.setDaemon(true);

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join(3000); // calling thread (ex.main) waits until the specified ...
        thread2.start();
    }

}
