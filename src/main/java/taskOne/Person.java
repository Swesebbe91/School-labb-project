package taskOne;

public class Person {
    private String name;
    private Gender gender;
    private double salary;

    public Person() {
        this.name = "unknown";
        this.gender = null;
        this.salary = 0.0;
    }

    public Person(String name, Gender gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", Gender='" + gender + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
