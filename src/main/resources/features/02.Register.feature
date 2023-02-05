Feature: Register Pege

  Scenario: TCC.002 As a user I want to register an account
    When TCC.002 Input registration data Email, NoHandphone, Password,ConfirmPassword, inputFirstName, inputLastName
    And TCC.002 Search regency or city
    And TCC.002 Click on terms and conditions
    And TCC.002 Click register button
    And TCC.002 Select verification methode OTP code
    Then TCC.002 account is successfully created go to home page


