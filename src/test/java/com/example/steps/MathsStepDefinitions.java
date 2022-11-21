package com.example.steps;

import com.example.BaseTest;
import com.example.app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest{

    Calculator calculator = new Calculator();
    @Given("user already login")
    public void userAlreadyLogin() {
        loginPage.inputUsername("admin");
        loginPage.inputPassword("admin");
        loginPage.clickLoginBtn();
    }
    @When("user input {int} as first number")
    public void userInputAsFirstNumber(int num) {
        calculatorPage.intputNum1(num);
    }
    @And("user input {int} as second number")
    public void userInputAsSecondNumber(int num) {
        calculatorPage.intputNum2(num);
    }
    @When("user input {float} in first number")
    public void userInputInFirstNumber(float num) {
        calculatorPage.intputFloat1(num);
    }
    @And("user input {float} in second number")
    public void userInputInSecondNumber(float num) {
        calculatorPage.intputFloat2(num);
    }
    @When("user input {string} as first number")
    public void userInputAsFirstNumber(String num) {
        calculatorPage.intputString1(num);
    }

    @And("user input {string} as second number")
    public void userInputAsSecondNumber(String num) {
        calculatorPage.intputString2(num);
    }
    @And("user click calculate button")
    public void userClickCalculateButton() {
        calculatorPage.clickCalculateButton();
    }
    @Then("the result is {string}")
    public void theResultIs(String Hasil) {
        String getNum = calculatorPage.getResult();
        Assertions.assertEquals(Hasil,getNum);}
    @And("user choose {} function")
    public void userChooseAddedFunction(String added) {
        if (added.equals("+")){
            calculatorPage.clickAddedFunction();
        } else if (added.equals("-")) {
            calculatorPage.clickMinusFunction();
        }else if (added.equals("*")) {
            calculatorPage.clickMultiplyFunction();
        }else if (added.equals("/")) {
            calculatorPage.clickDividesFunction();
        }
    }
}
