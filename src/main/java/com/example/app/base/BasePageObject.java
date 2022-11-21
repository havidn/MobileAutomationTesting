package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
public class BasePageObject {
  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }
  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }
  public void typeString(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }
  public void typeInt(By by, int num){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(Integer.toString(num));
  }
  public void typeFloat(By by, float num){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(Float.toString(num));
  }
  public void click(By by){
    find(by).click();
  }
  public String getText(By by){
    return find(by).getText();
  }
}
