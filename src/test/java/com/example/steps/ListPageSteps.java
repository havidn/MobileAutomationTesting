package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
public class ListPageSteps extends BaseTest {
  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }
  @And("user multiple click on {string}")
  public void userMultipleClickOnListMenu(String list) {
    listPage.mutlipleTap(list);
  }
  @And("user long press on {string}")
  public void userLongPressOnListKe(String list) {
    listPage.longPress(list);
  }
  @And("user swipe to find {string}")
  public void userSwipeToFind(String list) {
    listPage.swipeUntil(list);
  }
}
