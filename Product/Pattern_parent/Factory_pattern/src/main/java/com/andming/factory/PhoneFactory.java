package com.andming.factory;

import com.andming.phone.Phone;
import com.andming.phone.impl.Oppo;
import com.andming.phone.impl.Vivo;
import com.andming.phone.impl.XiaoMi;

public class PhoneFactory {
    public Phone getPhone(String phoneType){
        if(phoneType==null){
            return null;
        }
        if (phoneType.equals("Oppo")){
            return new Oppo();
        }else if (phoneType.equals("Vivo")){
            return new Vivo();
        }else if (phoneType.equals("XiaoMi")){
            return new XiaoMi();
        }else {
            return null;
        }
    }
}
