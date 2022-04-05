package com.study.springcore.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {

	public static void main(String[] args) {
		// 一.建立cglib的增強類 + 配置設定
		Enhancer enhancer=new Enhancer();
        // 1-1被增強的目標類
		enhancer.setSuperclass(Customer.class);
		// 1-2實現攔截方法
		enhancer.setCallback(new MyMethodInterceptor());
		// 2 透過cglib的增強類建立目標實體
		Customer customer=(Customer)enhancer.create();
		System.out.println(customer.buy("麵包"));
	}

}
