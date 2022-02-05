package taskFour;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MultithreadThing(0, 250_000), "Thread one");
        Thread t2 = new Thread(new MultithreadThing(250_001, 500_000), "Thread two");

        t1.start();
        t2.start();

    }
}