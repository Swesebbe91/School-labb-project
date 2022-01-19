package taskFour;

public class MultiThreadThing2 implements Runnable {
    PrimeNumber pa = new PrimeNumber();

    @Override
    public void run() {
        pa.testPrimeNumber(25, 100);
    }
}
