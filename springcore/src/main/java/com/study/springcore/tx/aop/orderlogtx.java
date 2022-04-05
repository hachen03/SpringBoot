package com.study.springcore.tx.aop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class orderlogtx {
     @Pointcut(value="execution(* com.study.springcore.tx.controller.BookController.buyBook(..))")
     public void pt() {}
     @Pointcut(value="execution(* com.study.springcore.tx.controller.BookController.buyBooks(..))")
     public void pt2() {}
     
     @Before(value="pt()")
     public List<String> before()
   	{
   		List<String> logtime=new ArrayList();
         Date date=new Date();
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         logtime.add(sdf.format(date));
         System.out.println(logtime);
         return logtime;
   	}
     @Before(value="pt2()")
     public List<String> before2()
   	{
   		List<String> logtime=new ArrayList();
         Date date=new Date();
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         logtime.add(sdf.format(date));
         System.out.println(logtime);
         return logtime;
   	}
     
}
// Homework 建立交易紀錄 order_log 資料表
// Vincent在2020/1/23 PM 2:07:51買了java書2本共300元
// Vincent在2020/1/23 PM 2:08:51買了python書2本共300元
// Vincent在2020/1/23 PM 2:10:51買了java書4本共600元
// 注意 : 若book的price欄位有變動，order_log則不影響
// 試問:資料表應如何創建 ?
