package com.andming.phone.impl;

import com.andming.phone.Phone;

public class XiaoMi implements Phone {
    public void call(String num) {
        System.out.println("用小米给"+num+"打电话");
    }
}
