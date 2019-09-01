public class DeadLock {

    private static Object ob1 = new Object();
    private static Object ob2 = new Object();

    public static void main(String[] args) {

        new Thread("thread1"){
            public void run() {
                synchronized (ob1) {
                    System.out.println(Thread.currentThread() + "开始");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (ob2){
                        System.out.println(Thread.currentThread() + "结束");
                    }
                }
            }
        }.start();

        new Thread("thread2"){
            public void run() {
                synchronized (ob2) {
                    System.out.println(Thread.currentThread() + "开始");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (ob1){
                        System.out.println(Thread.currentThread() + "结束");
                    }
                }
            }
        }.start();

    }

}
