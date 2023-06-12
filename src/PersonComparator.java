import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int p1SurnameWords = p1.getSurname().split(" ").length;
        int p2SurnameWords = p2.getSurname().split(" ").length;

        if (p1SurnameWords != p2SurnameWords) {
            return p2SurnameWords - p1SurnameWords;
        }

        return p2.getAge() - p1.getAge();
    }
}
