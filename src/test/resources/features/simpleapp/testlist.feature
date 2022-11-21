@android
  Feature: list
    Scenario: long press
      Given user already login
      When user go to list menu
      And user swipe to find "List ke-12"
      And user long press on "List ke-12"

    Scenario: tap multiple times
      Given user already login
      When user go to list menu
      And user swipe to find "List ke-12"
      And user multiple click on "List ke-12"
