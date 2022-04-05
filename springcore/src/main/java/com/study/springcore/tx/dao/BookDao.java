package com.study.springcore.tx.dao;

import com.study.springcore.tx.exception.insufficientAmount;
import com.study.springcore.tx.exception.insufficientQuantity;

public interface BookDao {
        Integer getPrice(Integer bid);
        Integer getStockAmount(Integer bid);
        Integer getWalletMoney(Integer wid);
        Integer updateStock(Integer bid,Integer amount) throws insufficientQuantity; // 減去庫存
        Integer updateWallet(Integer wid,Integer money) throws insufficientAmount; // 減去餘額
}
