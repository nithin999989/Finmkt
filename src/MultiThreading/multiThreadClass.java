package MultiThreading;

class Threads extends Thread {
    public void run() {
        for(int i=1;i<3;i++) {
            System.out.println("Finmkt1 is a digital lending platform");
            System.out.println("Finmkt2 is a digital lending platform");
        }
    }
}

public class multiThreadClass {
    public static void main(String args[]) {
        Threads t1 = new Threads();
        t1.start();
        Threads t2 = new Threads();
        t2.start();
    }
}

