package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }
  public boolean checkHamburgerBtnAppear() {
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }
  public void intputNum1(int angka1) {
    typeInt(MobileBy.id("et_1"), angka1);
  }
  public void intputNum2(int angka2) {
    typeInt(MobileBy.id("et_2"), angka2);
  }
  public void clickAddedFunction(){
    click(MobileBy.id("spinner_1"));
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
  }
  public void clickMinusFunction(){
    click(MobileBy.id("spinner_1"));
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
  }
  public void clickMultiplyFunction(){
    click(MobileBy.id("spinner_1"));
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
  }
  public void clickDividesFunction(){
    click(MobileBy.id("spinner_1"));
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
  }
  public String getResult() {
    return getText(MobileBy.id("tv_result"));
  }
  public void clickCalculateButton(){
    click(MobileBy.id("acb_calculate"));
  }
  public void intputFloat1(float angka1) {
    typeFloat(MobileBy.id("et_1"), angka1);
  }
  public void intputFloat2(float angka2) {
    typeFloat(MobileBy.id("et_2"), angka2);
  }
  public void intputString1(String angka1) {
    typeString(MobileBy.id("et_1"), angka1);
  }
  public void intputString2(String angka2) {
    typeString(MobileBy.id("et_2"), angka2);
  }

}
