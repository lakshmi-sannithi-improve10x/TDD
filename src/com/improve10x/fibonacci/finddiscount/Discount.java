package com.improve10x.fibonacci.finddiscount;

public class Discount {
    public int findDiscount(int price, int discount) {
        int discountAmount = 0;
        int finalPrice = 0;
        discountAmount = price * discount / 100;
        finalPrice = price - discountAmount;
        return finalPrice;
    }
}
