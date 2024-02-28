package com.zhang.test;

import java.math.BigDecimal;
import java.util.HashMap;

public class Shop {

    private HashMap<Integer,Goods> goodsMap=new HashMap<Integer, Goods>();

    private BigDecimal fullMoney=BigDecimal.valueOf(0);

    private BigDecimal discountMoney=BigDecimal.valueOf(0);;

    public void addGoods(Integer integer,Goods goods){
        this.goodsMap.put(integer,goods);
    }


    public void setFullDiscount(BigDecimal fullMoney,BigDecimal discountMoney){
        this.fullMoney = fullMoney;
        this.discountMoney = discountMoney;

    }

    public BigDecimal check(HashMap<Integer,Integer> shoppingMap){
        BigDecimal result = BigDecimal.valueOf(0);
        for(Integer id:shoppingMap.keySet()){
            result=result.add(goodsMap.get(id).getPrice().multiply(new BigDecimal(shoppingMap.get(id))));
        }

        //满减折扣
        if(this.fullMoney.compareTo(new BigDecimal(0))>0 && this.discountMoney.compareTo(new BigDecimal(0))>0){
            BigDecimal[] bigDecimals = result.divideAndRemainder(fullMoney);
            result=result.subtract(bigDecimals[0].multiply(discountMoney));
        }

        return result;
    }


}
