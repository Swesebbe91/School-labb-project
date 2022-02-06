package taskTwo;


import lombok.Data;

@Data

abstract public class Car {
    String Brand;
    String model;
    TypeOfCar type;
    int seats;

    public Car(String brand, String model, TypeOfCar type, int seats) {
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
                ", type=" + type +
                ", seats=" + seats +
                '}';
    }
}
