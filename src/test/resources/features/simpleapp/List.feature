@login @android
Feature: Login

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    When user go to list menu
    And user do scroll
