package com.study.springcore.tx.exception;
//庫存量不足
public class insufficientQuantity extends Exception {
	
    public insufficientQuantity(String message) {
   	          super(message);
   }
}
