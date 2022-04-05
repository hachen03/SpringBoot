package com.study.springcore.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.ext.Attributes2;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloTime a1=ctx.getBean(HelloTime.class);
        System.out.println(a1.sayHI());
        HelloTime a2=ctx.getBean(HelloTime.class);
        System.out.println(a2.sayHI());
	}

}
