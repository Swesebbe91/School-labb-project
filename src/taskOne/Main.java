package taskOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> employees = getEmployees();


        List<Person> femaleEmployees = employees.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

       List<Person> maleEmployees = employees.stream()
               .filter(person -> person.getGender().equals(Gender.MALE))
               .collect(Collectors.toList());

        System.out.println(femaleEmployees);
        System.out.println(maleEmployees);

        System.out.println(getAverageSalaries(femaleEmployees));
        System.out.println(getAverageSalaries(maleEmployees));



    }
    private static List<Person> getEmployees () {
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
    public static String getAverageSalaries(List<Person> Salaries) {

        double salary = Salaries.stream()
                .mapToDouble(Person::getSalary)
                .average().getAsDouble();
                return String.format("The average salary is %.1f kr", salary);

    }

}
