package taskTwo;

import java.util.Scanner;

public class CarFactory {
    public static Car createCar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of car would you like to create? write Suv or Minibus, else default = \"Estate\" \r");
        String carToCreate = scan.nextLine();

        Car car = null;
        switch (carToCreate.toLowerCase()) {

            case "suv":
                car = new Suv("Volvo", "XC90", "hybrid-bil", 5);
                break;

            case "minibus":
                car = new Minibus("Renault", "Trafic", "Bensin", 9);
                break;

            default:
                 car = new Estate("Volvo", "V60", "Elbil", 5);

        }
            return car;



    }
}


