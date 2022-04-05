package com.study.springcore.proxy.sta;

import com.study.springcore.proxy.sta.Man;
import com.study.springcore.proxy.sta.Person;
import com.study.springcore.proxy.sta.PersonProxy;
import com.study.springcore.proxy.sta.Women;

public class ProxyTest {
         public static void main(String[] args) {
			  Person man=new PersonProxy(new Man());
			  Person women=new PersonProxy(new Women());
			  
			  man.work();
			  women.work();
		}
}
