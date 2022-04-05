package com.study.springcore.case05;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext5.xml");
		
        Student john=ctx.getBean("s1",Student.class);
        //System.out.println(john);
        
        Student mary=ctx.getBean("s2",Student.class);
        //System.out.println(mary);
        
        //請問mary的老師有誰? 印出 name
        Teacher teacher1=ctx.getBean("t1",Teacher.class);
        Teacher teacher2=ctx.getBean("t2",Teacher.class);
        Teacher[] teacher= {teacher1,teacher2};
        
        Stream.of(teacher).filter(
        		str->{
        			 for(Clazz cla:str.getClazzs()) 
        			 {
        				 for(Clazz cla2:mary.getClazzs())
        				 {
        					 if(cla.getId()==cla2.getId())
        					 {
        						 return true;
        					 }
        				 }
        			 }
					return false;
        		}
        		).map(Teacher::getName).forEach(System.out::println);
 

        		
                            	                  		 
  

				     
}
}

