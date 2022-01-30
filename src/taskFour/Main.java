package taskFour;


public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MultithreadThing(0, 250_000));
        Thread t2 = new Thread(new MultithreadThing(250_001, 500_000));

        t1.start();
        t2.start();

    }
}