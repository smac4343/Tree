import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", 30));
        people.add(new Person("Петр", "Петров Петрович", 40));
        people.add(new Person("Алексей", "Сидоров Сидорович Сидоров", 25));
        people.add(new Person("Анна", "Каренина", 35));
        people.add(new Person("Мария", "Медведева Медведева", 45));
        people.add(new Person("Дмитрий", "Смирнов", 15)); // Добавляем человека младше 18 лет
        people.add(new Person("Елена", "Петрова", 20)); // Добавляем еще одного человека младше 18 лет

        people.removeIf(person -> person.getAge() < 18); // Удаление людей младше 18 лет с помощью лямбда-выражения

        for (Person person : people) {
            System.out.println(person);
        }
    }
}