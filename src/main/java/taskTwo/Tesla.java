package taskTwo;

public class Tesla extends Car {

    Tesla() {
        super("Tesla", "Model X", TypeOfCar.ELETRIC, 5);
    }

    Tesla(String brand, String model, TypeOfCar type, int seats) {
        super(brand, model, type, seats);
    }

    public void setSeats(int seats) {
        if (seats < 5) {
            System.out.println("Needs to be 5 seats");
            this.seats = 5;
        }
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", seats=" + seats +
                '}';
    }
}

