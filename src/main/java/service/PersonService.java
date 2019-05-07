package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> Persons = new Hashtable<String, Person>();

	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(32);
		p.setFirstName("Gustavo");
		p.setLastName("Scipiao");
		Persons.put("1", p);

		p = new Person();
		p.setId("2");
		p.setFirstName("Erika");
		p.setLastName("Coelho");
		Persons.put("2", p);
	}

	public Person getPerson(String id) {
		if (Persons.containsKey(id))
			return Persons.get(id);
		else
			return null;
	}

	public Hashtable<String, Person> getAll() {
		return Persons;
	}

}
