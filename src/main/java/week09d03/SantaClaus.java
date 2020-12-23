package week09d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SantaClaus {

    List<Person> persons = new ArrayList<>();

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return new ArrayList(persons);
    }

    public void getThroughChimneys() {
        for (Person item : persons) {
            item.setPresent();
        }
    }

}



