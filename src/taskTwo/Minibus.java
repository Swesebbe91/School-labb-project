package taskTwo;


public class Minibus extends Car {

    public Minibus() {
        super("Renault","Trafic", "Bensin", 9);
    }

    public Minibus(String brand, String model, String type, int seats) {
        super(brand, model, type, seats);
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                '}';
    }
}
