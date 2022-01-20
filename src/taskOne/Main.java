package taskOne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> employees = getEmployees(); //Hämtar anställda

        List<Person> femaleEmployees = employees.stream() //Hämtar alla kvinnor i listan
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        List<Person> maleEmployees = employees.stream() //Hämtar alla män i listan
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());

        getAverageSalaries(femaleEmployees); // Metod som räknar ut medelinkomsten för kvinnor
        getAverageSalaries(maleEmployees); // Metod som räknar ut medelinkomsten för män
        getMaxSalary(employees); //Metod som räknar ut högsta inkomsten in inmatad lista
        getLowestSalary(employees); //Metod som räknar ut lägsta inkomsten i inmatad lista


    }

    private static List<Person> getEmployees() { //Metod för att hämta nya personer till en lista
        return List.of(
                new Person("Sebastian", Gender.MALE, 30_000),
                new Person("John", Gender.MALE, 22_000),
                new Person("Stina", Gender.FEMALE, 32_000),
                new Person("linus", Gender.MALE, 36_000),
                new Person("Linnea", Gender.FEMALE, 23_000),
                new Person("Agnes", Gender.FEMALE, 34_000),
                new Person("Victoria", Gender.FEMALE, 30_000),
                new Person("Fredrik", Gender.MALE, 27_500),
                new Person("Lisa", Gender.FEMALE, 26_500),
                new Person("Mattias", Gender.MALE, 29_000)
        );
    }

    public static void getAverageSalaries(List<Person> salaryList) { //Metod som tar ut medelinkomsten i listan som skickas in

        double salary = salaryList.stream()
                .mapToDouble(Person::getSalary)
                .average().getAsDouble();
        System.out.println(String.format("The average salary is %.1f kr", salary));

    }

    public static void getMaxSalary(List<Person> salaryList) { //Metod som tar ut högsta inkomsten i listan som skickas in
        double maxSalary = salaryList.stream()
                .mapToDouble(Person::getSalary)
                .max().getAsDouble();
        System.out.println("The highest salary in the list is: " + maxSalary);
    }

    public static void getLowestSalary(List<Person> salaryList) { //Metod som tar ut lägsta inkomsten i listan som skickas in
        double lowestSalary = salaryList.stream()
                .mapToDouble(Person::getSalary)
                .min().getAsDouble();
        System.out.println("The lowest salary in the list is " + lowestSalary);
    }


}
