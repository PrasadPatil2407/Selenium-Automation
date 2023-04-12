Feature:Practice Form

  @PracticeForm
  Scenario: User fills the Practice form
    Given user is on the URL of Practice form
    Then user Enters the first name
    Then user Enters the last name
    Then user Enters the last Email
    Then user selects the Gender
    Then user selects the Profession
    Then user selects the Country from DropDown
    Then  user selects the Skills
    Then user click the 'Click me' button
    Then user click on 'Alert' button