package com.study.springcore.case08;

import java.util.List;

public interface PersonDao {
       //建立Person
	   boolean create(Person person);
	   //查詢Person
	   List<Person> readAll();
}
