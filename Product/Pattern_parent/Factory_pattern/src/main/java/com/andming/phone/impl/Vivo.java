package com.andming.phone.impl;

import com.andming.phone.Phone;

public class Vivo implements Phone {
    public void call(String num) {
        System.out.println("用Vivo给"+num+"打电话");
    }
}
