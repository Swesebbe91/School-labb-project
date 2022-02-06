package taskTwo;

import java.util.Scanner;

public class CarFactory {
    public static Car createCar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of car would you like to create? Write Suv, Minibus or Tesla, default car will be a= \"Kombi\" \r");
        String carToCreate = scan.nextLine();

        Car car;
        switch (carToCreate) {

            case "suv":
                car = new Suv();
                break;

            case "minibus":
                car = new Minibus();
                break;

            case "tesla":
                car = new Tesla();
                break;

            default:
                car = new Kombi();
                break;
        }
        return car;
    }
}


