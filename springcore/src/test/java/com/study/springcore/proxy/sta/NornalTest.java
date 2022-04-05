package com.study.springcore.proxy.sta;

import com.study.springcore.proxy.sta.Man;
import com.study.springcore.proxy.sta.Person;
import com.study.springcore.proxy.sta.Women;

public class NornalTest {

	public static void main(String[] args) {
             Person man=new Man();
             Person women=new Women();
             
             
            man.work();
            women.work();
	}

}
