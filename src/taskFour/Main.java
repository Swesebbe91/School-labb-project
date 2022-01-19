package taskFour;


public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MultithreadThing());
        Thread t2 = new Thread(new MultiThreadThing2());

        t1.start();
        t2.start();

    }
}