package com.study.springcore.tx.exception;

import org.aspectj.apache.bcel.ExceptionConstants;

// 餘額不足
public class insufficientAmount extends Exception {
	
      public insufficientAmount(String message) {
    	  super(message);
      }
}
