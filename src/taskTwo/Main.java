package taskTwo;

public class Main {
    public static void main(String[] args) {

        Car b1 = CarFactory.createCar();
        Car b2 = CarFactory.createCar();
        Car b3 = CarFactory.createCar();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
