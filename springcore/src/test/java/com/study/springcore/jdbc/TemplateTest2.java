package com.study.springcore.jdbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springcore.jdbc.entity.Emp;
import com.study.springcore.jdbc.template.EmpDao;

public class TemplateTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc-config.xml");
        EmpDao empDao=ctx.getBean("empDao",EmpDao.class);
        int rowcount=0;
        int[] rowcounts=null;
        //測試單筆新增I
        //rowcount=empDao.addOne1("test1", 18);
       //System.out.println("測試單筆新增I :"+rowcount);
       //測試單筆新增II
        //rowcount=empDao.addOne2("test2", 19);
        //System.out.println("測試單筆新增II :"+rowcount);
       //測試多筆新增I
       /* List<Object[]> rows = new ArrayList<>();
        rows.add(new Object[] {"JoJo",23});
        rows.add(new Object[] {"Markery",24});
        rows.add(new Object[] {"Vincent1",25});
        rowcounts=empDao.multiAdd1(rows);
        System.out.println("測試多筆新增I :"+ Arrays.toString(rowcounts));*/
       //測試多筆新增II
        /*List<Emp> emps=new ArrayList<>();
        emps.add(new Emp("Bobo",25));
        emps.add(new Emp("Bob",26));
        emps.add(new Emp("Alice",27));
        rowcounts=empDao.multiAdd2(emps);
        System.out.println("測試多筆新增II :"+ Arrays.toString(rowcounts));*/ 
        //測試修改
        /*rowcount = empDao.updateById(1,"Tom", 34);
        System.out.println("測試-測試修改 I:"+rowcount);*/
        //測試刪除
        /*rowcount = empDao.deleteById(50);
        System.out.println("測試-測試刪除 I:"+rowcount);*/
	}

}
