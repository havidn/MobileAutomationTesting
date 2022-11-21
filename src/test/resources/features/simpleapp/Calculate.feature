@android
Feature: Calculator
  Scenario Outline: calculate with valid input
    Given user already login
    When user input <angka1> as first number
    And user choose <operation> function
    And user input <angka2> as second number
    And user click calculate button
    Then the result is "<hasil>"
    Examples:
    |angka1 |angka2|hasil       |operation|
    |5      |2     |Hasil : 7   |+        |
    |-5     |-2    |Hasil : -7  |+        |
    |5      |2     |Hasil : 3   |-        |
    |-2     |4     |Hasil : -6  |-        |
    |4      |2     |Hasil : 2   |/        |
    |-12    |-3    |Hasil : 4   |/        |
    |5      |2     |Hasil : 10  |*        |
    |-5     |-3    |Hasil : 15  |*        |
  Scenario Outline: Adding function with invalid input
    Given user already login
    When user input "<angka1>" as first number
    And user choose + function
    And user input "<angka2>" as second number
    And user click calculate button
    Then the result is "Hasil : 0"
    Examples:
      |angka1|angka2|
      |a     |b     |
      |!     |#     |
      |      |      |
  Scenario: Adding function with decimal input
    Given user already login
    When user input 1.5 in first number
    And user choose + function
    And user input 1.5 in second number
    And user click calculate button
    Then the result is "Hasil : 3"
  Scenario Outline: Multiply function with long data input
    Given user already login
    When user input <angka1> as first number
    And user choose * function
    And user input <angka2> as second number
    And user click calculate button
    Then the result is "<hasil>"
    Examples:
      |angka1         |angka2          |hasil       |
      |1000000000     |1000000000      |Hasil : 1000000000000000000  |
      |1000000000     |10000000000     |Hasil : 10000000000000000000  |
#      1e9             1e10             1e19
  Scenario: Divide function with decimal result
    Given user already login
    When user input 5 as first number
    And user choose / function
    And user input 2 as second number
    And user click calculate button
    Then the result is "Hasil : 2.5"