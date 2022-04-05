package com.study.springcore.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.text.DateFormatter;

public class test {

	public static void main(String[] args) {
		List<String> logtime=new ArrayList();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        logtime.add(sdf.format(date));
        System.out.println(logtime);

}
}