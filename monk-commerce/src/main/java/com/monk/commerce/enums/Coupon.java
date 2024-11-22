package com.monk.commerce.enums;

public enum Coupon {

    PRODUCT_COUPON(1, "PRODUCT_COUPON"),
    CART_COUPON(2, "CART_COUPON"),
    BUYX_GETY(3, "BUYX_GETY");

    public int value;
    public String name;

    Coupon(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
