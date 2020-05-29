package com.etoak;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class Sjh {

    public static void main(String[] args) {
        MobileCodeWS ws = new MobileCodeWS();
        MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
        String mobileCodeInfo = soap.getMobileCodeInfo("1825335", "");
        System.out.println(mobileCodeInfo);

    }
}
