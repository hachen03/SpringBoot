package com.study.springcore.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springcore.aop.Calc;

public class CalcTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        Calc calc=ctx.getBean("calcImpl",Calc.class);
        System.out.println(calc.add(10,20));
	}

}
