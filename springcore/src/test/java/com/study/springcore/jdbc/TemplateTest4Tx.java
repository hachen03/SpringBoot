package com.study.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springcore.jdbc.template.EmpDao;

public class TemplateTest4Tx {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc-config.xml");
        EmpDao empDao=ctx.getBean("empDao",EmpDao.class);
        
        empDao.addOneTx("Txtx3", 30);
        System.out.println("addOneTx OK !");

}
}