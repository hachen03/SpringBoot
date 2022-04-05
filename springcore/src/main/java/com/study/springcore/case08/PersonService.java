package com.study.springcore.case08;

import java.util.Date;
import java.util.List;

public interface PersonService {
       boolean append(String name,Date birth);
       boolean append(Person person);
       List<Person> findAllPersons();
       Person getPerson(String name);
       Person getPersonBydate(Date date);
       Person getPersonByage(int age);
       Person setPersonByname(String name,Date date);
       void deletePersonByname(String name);
}
