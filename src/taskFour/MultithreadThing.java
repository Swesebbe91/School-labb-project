package taskFour;

public class MultithreadThing implements Runnable {
    private int start;
    private int stop;
    public MultithreadThing(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }
    PrimeNumber p = new PrimeNumber();
    @Override
    public void run() {
        p.tryTest(start, stop);

    }



}



