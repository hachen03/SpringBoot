package com.study.springcore.proxy.cglib;
// Enhancer 增強型的 Customer
public class EnhancerCustomer extends Customer {
       public String buy(String data)
       {
    	   return super.buy(data)+"\n"+"請先出示實聯";
       }
}
