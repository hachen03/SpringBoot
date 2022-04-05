package com.study.springcore.proxy.dyn;

public class DynProxyTest2 {
public static void main(String[] args) {
	   Calc calc=(Calc)new DynProxy(new CalcImpl()).getProxy();
	   System.out.println(calc.add(10,20));
	   Calc calc2=(Calc)new DynProxy(new CalcImpl()).getProxy();
	   System.out.println(calc2.div(10,0));
}
}
