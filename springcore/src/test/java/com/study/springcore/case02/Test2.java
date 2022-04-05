package com.study.springcore.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext2.xml");
		Color color=ctx.getBean("color",Color.class);
		Size size=ctx.getBean("size",Size.class);
		Color color1=ctx.getBean("blue",Color.class);
		Size size1=ctx.getBean("b5",Size.class);

		Paper paper2=ctx.getBean("paper2",Paper.class);
		Paper paper3=ctx.getBean("paper3",Paper.class);
		Paper2 paper4=ctx.getBean("paper4",Paper2.class);
		

		System.out.println(color1);
		System.out.println(size1);
		System.out.println(color);
		System.out.println(size);
		System.out.println(paper2);
		System.out.println(paper3);
		System.out.println(paper4);
	}

}
