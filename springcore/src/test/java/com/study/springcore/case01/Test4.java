package com.study.springcore.case01;

import java.util.Arrays;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CPU cpu3=ctx.getBean("cpu3",CPU.class);
		CPU cpu4=ctx.getBean("cpu4",CPU.class);
		CPU cpu5=ctx.getBean("cpu5",CPU.class);
		CPU cpu6=ctx.getBean("cpu6",CPU.class);
        
		Ram ram1=ctx.getBean("ram1",Ram.class);
		Ram ram2=ctx.getBean("ram2",Ram.class);
		Ram ram3=ctx.getBean("ram3",Ram.class);
		Ram ram4=ctx.getBean("ram4",Ram.class);
		
		HD hd1=ctx.getBean("hd1",HD.class);
		HD hd2=ctx.getBean("hd2",HD.class);
		HD hd3=ctx.getBean("hd3",HD.class);
         //自組電腦
		Computer computer=ctx.getBean("computer",Computer.class);
		computer.setCpu(cpu6);
		computer.setRam(ram4);
		computer.setHd(hd3);
		System.out.println(computer);
		//品牌機
		Computer acer=ctx.getBean("acer",Computer.class);
		System.out.println(acer);
		Computer ibm=ctx.getBean("ibm",Computer.class);
		System.out.println(ibm);
		//電腦陣列
		Computer[] computers= {computer,acer,ibm};
		double total=Arrays.stream(computers).mapToDouble(Computer::getPrice).sum();
		System.out.println(total);
		
	}

}
