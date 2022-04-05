package com.study.springcore.case08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PersonSystem {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext8.xml");
    PersonController personController=ctx.getBean("personController",PersonController.class);
    private boolean stop;
    private void menu() {
    	System.out.println("============================");
    	System.out.println("1.建立Person資料");
    	System.out.println("2.取得Person全部資料");
    	//作業2
    	System.out.println("3.根據姓名取得Person");
    	System.out.println("4.取得今天生日的Person");
    	System.out.println("5.取得某一歲數以上的Person");
    	System.out.println("6.根據姓名來修改Person的生日");
    	System.out.println("7.根據姓名來刪除Person");
    	System.out.println("0.離開");
    	System.out.println("請選擇: ");
    	System.out.println("============================");
    	Scanner sc=new Scanner(System.in);
    	int choice=sc.nextInt();
    	switch (choice) {
    	case 1:
    		createPerson();
    		break;
    	case 2:
    		printPersons();
    		break;
    	case 3:
    		getPersonByname();
    		break;
    	case 4:
    		getPersonBydate();
    		break;
    	case 5:
    		getpersonByage();
    		break;
    	case 6:
    		setPersonByname();
    		break;
    	case 7:
    		deletePersonByname();
    		break;
		case 0:
			System.out.println("離開系統");
			stop=true;
			break;
		}
    }
    private void getPersonByname()
    {
    	 System.out.println("請輸入姓名");
    	 Scanner sc=new Scanner(System.in);
    	 String name=sc.next();
    	 Person person=personController.getPersonByName(name);
    	 System.out.println(person);
    }
    private void deletePersonByname()
    {
    	System.out.println("請輸入姓名");
    	Scanner sc=new Scanner(System.in);
    	String name=sc.next();
    	personController.deletePersonByname(name);
    }
    private void setPersonByname()
    {
    	System.out.println("請輸入姓名與修改日期");
    	Scanner sc=new Scanner(System.in);
    	String name=sc.next();
    	String date=sc.nextLine();
    	try {
    		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        	Date birth=format.parse(date);
        	Person person=personController.setPersonByname(name,birth);
        	System.out.println(person);
    	}
        catch(ParseException e)
    	{
        	e.printStackTrace();
    	}
    }
    private void getpersonByage()
    {
    	System.out.println("請輸入年齡");
    	Scanner sc=new Scanner(System.in);
    	int age=sc.nextInt();
    	Person person=personController.getPersonByage(age);
    	System.out.println(person);
    }
    private void getPersonBydate()
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期(ep:1995/03/16)：");
        String time = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = format.parse(time);
            System.out.println(date.getTime());
        } catch (ParseException e) {
            System.out.println("不合法的输入");
            e.printStackTrace();
        }
    }
    private void createPerson() {
    	System.out.println("請輸入姓名 生日年 月 日");
    	//Ex: Jack 1999 4 5
    	Scanner sc=new Scanner(System.in);
    	String name=sc.next();
    	int yyyy=sc.nextInt();
    	int mm=sc.nextInt();
    	int dd=sc.nextInt();
    	personController.addPerson(name,yyyy,mm,dd);
    }
    private void printPersons() {
    	personController.printAllPersons();
    }
    public void start() {
    	while(!stop)
    		menu();
    }
    public static void main(String[] args) {
		new PersonSystem().start();
	}
    
}
