package com.andming.phone.impl;

import com.andming.phone.Phone;

public class Oppo implements Phone {
    public void call(String num) {
        System.out.println("用Oppo给"+num+"打电话");
    }
}
