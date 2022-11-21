package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;


public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
    typeString(MobileBy.id("username"), username);
  }

  public void inputPassword(String password) {
    typeString(MobileBy.id("password"), password);
  }

  public void clickLoginBtn() {
    click(MobileBy.id("login"));
  }

}
