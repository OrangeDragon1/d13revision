package sg.edu.nus.iss.d13revision.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.d13revision.models.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<>();
    
    public PersonService() {
        this.persons.add(new Person("Kobe", "Bryant"));
        this.persons.add(new Person("Lebron", "James"));
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void addPerson(String firstName, String lastName) {
        this.persons.add(new Person(firstName, lastName));
    }
}
