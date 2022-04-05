package com.study.springcore.jdbc.aop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(1)
public class TimeControl {
          @Pointcut(value="execution(* com.study.springcore.jdbc.template.EmpDao.queryAll(..))")
          public void pt() {}
          
          
          @Before(value = "pt()") 
      	public List<String> before()
      	{
      		List<String> logtime=new ArrayList();
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            logtime.add(sdf.format(date));
            System.out.println(logtime);
            return logtime;
      	}
}
