package taskTwo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

abstract public class Car {
    String Brand;
    String model;
    String type;
    int seats;

    public Car(String brand, String model, String type, int seats) {
        this.Brand = brand;
        this.model = model;
        this.type = type;
        this.seats = seats;

    }


    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                '}';
    }
}
