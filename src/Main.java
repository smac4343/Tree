import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", 30));
        people.add(new Person("Петр", "Петров Петрович", 40));
        people.add(new Person("Алексей", "Сидоров Сидорович Сидоров", 25));
        people.add(new Person("Анна", "Каренина", 35));
        people.add(new Person("Мария", "Медведева Медведева", 45));

        Collections.sort(people, new PersonComparator());

        for (Person person : people) {
            System.out.println(person);
        }
    }
}