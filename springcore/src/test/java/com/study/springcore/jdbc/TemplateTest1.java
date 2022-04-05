package com.study.springcore.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springcore.jdbc.aop.TimeControl;
import com.study.springcore.jdbc.template.EmpDao;

public class TemplateTest1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc-config.xml");
        EmpDao empDao=ctx.getBean("empDao",EmpDao.class);
        System.out.println(empDao.queryAll());
        //如何取得 eid=2的員工姓名
        List<Map<String,Object>> emps=empDao.queryAll();
        String ename=emps.stream().filter(e->(e.get("eid")+"").equals("2"))
        .findFirst()
        .get()
        .get("ename")+ "";
         System.out.println(ename); 
         /*
         Homework
         在每次查詢queryAll()中都可以將查詢時間log記錄下來
         +-------------+-------------------+    
         | method_name |   log_timestamp   |
         +-------------+-------------------+    
         |   queryAll  | 2022/1/10 13:50:43|
         +-------------+-------------------+ 
         |   queryAll  | 2022/1/11 14:40:13|
         +-------------+-------------------+
         |   queryAll  | 2022/1/12 10:30:22|
         +-------------+-------------------+  
         */
         //System.out.println(empDao.queryListEmps());
         //System.out.println(empDao.queryListEmps2());
	}

}
