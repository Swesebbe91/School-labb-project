package taskTwo;

public class Suv extends Car {
    public Suv(String brand, String model, String type, int seats) {
        super(brand, model, type, seats);
    }

    @Override
    public String toString() {
        return "Suv{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                '}';
    }
}