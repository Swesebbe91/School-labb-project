package taskTwo;

import java.util.Scanner;

public class CarFactory {
    public static Car createCar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of car would you like to create? write Suv or Minibus, else default car = \"Kombi\" \r");
        String carToCreate = scan.nextLine();

        Car car = null;
        switch (carToCreate.toLowerCase()) {

            case "suv":
                car = new Suv();
                break;

            case "minibus":
                car = new Minibus();
                break;

            default:
                 car = new Kombi();
                 break;

        }
            return car;



    }
}


