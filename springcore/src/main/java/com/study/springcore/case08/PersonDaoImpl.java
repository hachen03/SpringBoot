package com.study.springcore.case08;

import java.util.List;

import javax.print.attribute.PrintJobAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PersonDaoImpl implements PersonDao {
	   @Autowired
       private JsonDB jsonDB;
	@Override
	public boolean create(Person person) {
		boolean check=false;
		try {
			check=jsonDB.add(person);
		}catch(Exception e) {
			e.printStackTrace();
			check=false;
		}
		return check;
	}

	@Override
	public List<Person> readAll() {
		List<Person> people=null;
		try {
			people=jsonDB.queryAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 return people;
	}
}
