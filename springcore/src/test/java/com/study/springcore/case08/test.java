package com.study.springcore.case08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	public static void main(String[] args) throws Exception {
		 Date date=new Date();
		 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String sdate=dateFormat.format(date);
		 System.out.println(sdate);
		 /*Calendar calendar=Calendar.getInstance();
		 calendar.set(Calendar.MONTH,1);
		 Date date=calendar.getTime();
		 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 String sdate=simpleDateFormat.format(date);
		 int max=calendar.getActualMaximum(Calendar.DATE);
		 System.out.println(max);
		 System.out.println(sdate);
		 System.out.println(calendar.get(Calendar.YEAR));*/
		 /*
		 Date today =new Date();
	     Calendar calendar=Calendar.getInstance();
	     calendar.setTime(today);
	     int todayYear=calendar.get(Calendar.YEAR);
	     for(Person person:people) {
	    	 calendar.setTime(person.getBirth());
	    	 int birthYear=calendar.get(Calendar.YEAR);
	    	 int age=todayYear-birthYear;*/
		/*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期(ep:1995/03/16)：");
        String time = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = format.parse(time);
            System.out.println(date.getTime());
        } catch (ParseException e) {
            System.out.println("不合法的输入");
            e.printStackTrace();
        }*/
	}


}
