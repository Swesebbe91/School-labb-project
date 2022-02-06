package taskFour;

public class PrimeNumber {
    public void tryTest(int start, int stop) {

        for (int i = start; i < stop; i++) {
            boolean isAPrimeNumber = tryPrimeNumber(i);

            if (isAPrimeNumber) {
                System.out.println("Number " + i + " is a primenumber");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public boolean tryPrimeNumber(int number) {

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

}
