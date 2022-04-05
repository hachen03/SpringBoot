package com.study.springcore.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.springcore.tx.exception.insufficientAmount;
import com.study.springcore.tx.exception.insufficientQuantity;
import com.study.springcore.tx.service.BookService;
@Controller
public class BookController {
      @Autowired
      private BookService bookServicel;
      public void buyBook(Integer wid,Integer bid) {
    	   try {
    		   bookServicel.BuyOne(wid, bid);
        	   System.out.println("單筆 buyBook OK !");
		}catch (insufficientQuantity e) {
			System.err.println("庫存不足 :"+ e);
		}catch (insufficientAmount e) {
			System.err.println("金額不足 :" + e);
		}
      }
      public void buyBooks(Integer wid,Integer... bids) {
    	  try {
    		  bookServicel.BuyMany(wid, bids);
        	  System.out.println("多筆 buyBooks OK !");
		}catch (insufficientQuantity e) {
			System.err.println("庫存不足 :"+ e);
		}catch (insufficientAmount e) {
			System.err.println("金額不足 :" + e);
		}
      }
}
