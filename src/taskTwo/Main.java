package taskTwo;

public class Main {
    public static void main(String[] args) {

        Car b1 = CarFactory.createCar();

        System.out.printf("You created a %s of the model %s with %d seats", b1.getBrand(), b1.getModel(), b1.getSeats());

    }
}
