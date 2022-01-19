package taskFour;

public class MultithreadThing implements Runnable {

    PrimeNumber p = new PrimeNumber();

    @Override
    public void run() {

        p.testPrimeNumber(0, 50);

    }
}



