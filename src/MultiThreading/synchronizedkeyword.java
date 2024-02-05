package MultiThreading;

class Thread3 extends Thread {
    public synchronized void run() {
        for(int i=1;i<3;i++) {
            System.out.println("Finmkt1 is a digital lending platform");
            System.out.println("Finmkt2 is a digital lending platform");
        }
    }
}

public class synchronizedkeyword {
    public static void main(String args[]) {
        Thread3 t1 = new Thread3();
        t1.start();

        Thread3 t2 = new Thread3();
        t2.start();
    }
}
