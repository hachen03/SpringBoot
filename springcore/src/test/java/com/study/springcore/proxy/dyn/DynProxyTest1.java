package com.study.springcore.proxy.dyn;

import com.study.springcore.proxy.sta.Man;
import com.study.springcore.proxy.sta.Person;

public class DynProxyTest1 {
   public static void main(String[] args) {
	   Person man=(Person)new DynProxy(new Man()).getProxy();
	   man.work();
	   Calc calc=(Calc)new DynProxy(new CalcImpl()).getProxy();
	   System.out.println(calc.add(10,20));
}
}
