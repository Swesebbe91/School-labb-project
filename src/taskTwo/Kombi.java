package taskTwo;

public class Kombi extends Car {


    public Kombi() {
        super("Volvo", "V60", "Elbil", 5);
    }

    public Kombi(String brand, String model, String type, int seats) {
        super(brand, model, type, seats);
    }

    public void setSeats(int seats) {
        if(seats < 5) {
            System.out.println("Needs to be 5 seats");
            this.seats = 5;
        }


    }

    @Override
    public String toString() {
        return "Kombi{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", seats=" + seats +
                '}';
    }
}
