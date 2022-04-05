package com.study.springcore.tx.service;

import com.study.springcore.tx.exception.insufficientAmount;
import com.study.springcore.tx.exception.insufficientQuantity;

public interface BookService {
         void BuyOne(Integer wid,Integer bid) throws insufficientAmount, insufficientQuantity;
         void BuyMany(Integer wid,Integer... bids) throws insufficientAmount, insufficientQuantity;
}
