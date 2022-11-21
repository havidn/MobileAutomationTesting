package com.example.app;

import io.appium.java_client.MobileBy;
import com.example.app.base.BasePageObject;


public class Calculator extends BasePageObject {
    public int add(int a, int b) {
        return a + b;
    }


}