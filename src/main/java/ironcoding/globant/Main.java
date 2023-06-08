package ironcoding.globant;

import ironcoding.globant.model.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<Person> personList;

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person victor = new Person("Victor", 40);
        Person eva = new Person("Eva", 42);
        Person peter = new Person("Peter", 15);
        Person robert = new Person("Robert", 28);

        personList = Arrays.asList(sara, victor, eva, peter, robert);

        // Using stream return a list of string with all the names in Uppercase
        List<String> namesInUpperCase = personList.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());

        // Return a list of person with only the members that are older tan 20
        List<Person> olderThan20 = personList.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());

        // The first person older than 20 (order does not matter)
        Person older20 = personList.stream()
                .filter(person -> person.getAge() > 20)
                .findAny()
                .orElse(null);

        // The oldest person in the list
        Person oldest = personList.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}
