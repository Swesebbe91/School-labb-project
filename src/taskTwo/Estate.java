package taskTwo;

public class Estate extends Car {
    public Estate(String brand, String model, String type, int seats) {
        super(brand, model, type, seats);
    }

    @Override
    public String toString() {
        return "Estate{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                '}';
    }
}
