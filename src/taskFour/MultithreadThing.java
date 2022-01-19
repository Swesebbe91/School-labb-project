package taskFour;

import java.util.Scanner;

public class MultithreadThing implements Runnable {
    Scanner scan = new Scanner(System.in);
    public void tryTest() {
        System.out.println("Ange en startsiffra: ");
        int start = scan.nextInt();
        System.out.println("Ange en slutsiffra: ");
        int stop = scan.nextInt();

            for (int i = start; i < stop; i++) {

                boolean bool = isAPrimeNumber(i);

                if (bool == true) {
                    System.out.println("Siffran " + i + " är ett primtal " + bool);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

        }

        public boolean isAPrimeNumber(int number) {

            if (number <= 1) {
                System.out.println("It is not a prime number");
                return false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) return false;
                }
                return true;
            }
        }

    @Override
    public void run() {
        tryTest();

    }
}



