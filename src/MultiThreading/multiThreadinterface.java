package MultiThreading;

class Runnable1 implements Runnable {
    public void run() {
        for(int i=1;i<3;i++) {
            System.out.println("Finmkt1 is a digital lending platform");
            System.out.println("Finmkt2 is a digital lending platform");
        }
    }
}

public class multiThreadinterface {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Runnable1());
        t1.start();
        Thread t2 = new Thread(new Runnable1());
        t2.start();
    }
}
