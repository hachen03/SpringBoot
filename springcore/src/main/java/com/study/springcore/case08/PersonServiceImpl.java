package com.study.springcore.case08;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class PersonServiceImpl implements PersonService {
	      @Autowired
          private PersonDao personDao;
	@Override
	public boolean append(String name, Date birth) {
		Person person = new Person();
		person.setName(name);
		person.setBirth(birth);
		return append(person);
	}

	@Override
	public boolean append(Person person) {
		return personDao.create(person);
	}

	@Override
	public List<Person> findAllPersons() {
		return personDao.readAll();
	}

	@Override
	public Person getPerson(String name) {
		Optional<Person> optPerson=findAllPersons()
				.stream()
				.filter(p->p.getName().equals(name))
				.findFirst();
		  return optPerson.isPresent()?optPerson.get():null;
	}

	@Override
	public Person getPersonBydate(Date date) {
		 Optional<Person> gpbPerson=findAllPersons()
				 .stream()
				 .filter(p->p.getBirth().equals(date))
				 .findFirst();
		 return gpbPerson.isPresent()?gpbPerson.get():null;
		 }

	@Override
	public Person getPersonByage(int age) {
		Optional<Person> gpbaperson=findAllPersons()
				.stream()
				.filter(p->p.getAge()>age)
				.findAny();
		   return gpbaperson.isPresent()?gpbaperson.get():null;
	}

	@Override
	public Person setPersonByname(String name,Date date) {
		List<Person> person=findAllPersons();
		Optional<Person> spbnperson=person.stream().filter(p->p.getName().equals(name)).findFirst();
		for(Person person1:person)
		{
			person1.setBirth(date);
		}
		return  spbnperson.isPresent()?spbnperson.get():null;
	}

	@Override
	public void deletePersonByname(String name) {
		List<Person> person=findAllPersons();
		Optional<Person> dpbnperson=person.stream().filter(p->p.getName().equals(name)).findFirst();
        person.remove(person);
	}

}
