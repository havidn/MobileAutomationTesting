package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.Point;
public class ListPage extends BasePageObject {

  public void swipeList() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement containerList = find(MobileBy.id("recycler_view"));
    Point coordinate = containerList.getCenter();
    PointOption start = PointOption.point(coordinate);
    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
    //builder
    action
        .press(start)
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(end)
        .release()
        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }
  public void swipeUntil(String list){
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true))" +
                    ".scrollIntoView(new UiSelector().text(\""+list+"\"))"));

  }
  public void mutlipleTap(String list){
    TouchAction action = new TouchAction(getDriver());
    AndroidElement element = find(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView"));
    action.tap(TapOptions.tapOptions().withTapsCount(20)
                    .withElement(ElementOption.element(element)))
            .perform();
  }
  public void longPress(String list){
    TouchAction action = new TouchAction(getDriver());
    AndroidElement containerList = find(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView"));
    action.longPress(PointOption.point(containerList.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.of(10, ChronoUnit.SECONDS)))
            .release()
            .perform();
  }
}
