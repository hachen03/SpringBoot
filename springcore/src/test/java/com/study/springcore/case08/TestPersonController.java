package com.study.springcore.case08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonController {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext8.xml");
        PersonController personController=ctx.getBean("personController",PersonController.class);
        //personController.printAllPersons();
        personController.addPerson("Jack",2013,12,26);
        //personController.printAllPersons();
        //System.out.println(personController.getPersonByName("Randy"));
        //System.out.println(personController.getPersonByName("Allen"));
	}

}
