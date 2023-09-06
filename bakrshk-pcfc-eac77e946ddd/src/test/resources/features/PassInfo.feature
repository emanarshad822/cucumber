Feature: Enter Passinfo

  @Regression
  Scenario Outline: Search pass info
    Given I am on PCFC login page
    When I enter "<username>" and "<password>"
    Then I click sigin button
    Then click on pass management
    Then click on apply for pass
    When Enter Pass "Port" and "Entry Gate" information Port
    When Enter Pass "Pass Type" and "Pass Duration" information Pass
    When Enter Visitor "Visit Reason" and "Date of Visit" information Visit
    When Enter Visitor "Title" and "First Name" and "Last Name" information Title
    When Enter Visitor "Nationality" and "Mobile" information National
    When Enter Visitor "Visa Type" information Visa
    When Enter Visitor "Company Name" information  Company
    When Enter Visitor "Email" information  Email
    When Select Visitor "Designation" Designation
    Then Enter Document Values "id"
    Then Select Dates for "Passport Date" passport
    Then Select Dates for "Visa Date" Visit
    Then Select Dates for "Trade Date" Trade
    Then Select Dates for "LPO Date" LPO
    Then Select Dates for "Other date" Other
    Then Select Dates for "Emirates" emirate
    Then add visitor btn click
    Then Enter "Host Company" and "Person Name" Host
    Then i accept pay "Choose Pay"
    Then accept the agreement
    Then Click on submit button
#    Then Click on Confirm Btn
    Then i Select Payment "Payment Option" and "From"
    Then Click Agree Button
    Then Fill the Payment Card "Card num" and "CVN"
    Then Give the Expire Date "ExpireMonth" and "ExpireYear"
    Then click on next Btn
    Then click on Pay Btn
    Then Close the confirm Sponser
    Then i get the refernce id
    Then i Logout from PCFC
    Examples:
      |username | password|
      |Rampco |Login@345 |

  @Regression
  Scenario Outline: Search Ref Number With Galaxy User
    Given I am on PCFC login page
    When I enter "<username>" and "<password>"
    Then I click sigin button
    Then click on pass management
    Then Click Pass Approval
    Then Enter Pass "Pass Refer" Number
    Then Click Search Button
    Then Verify the Data Present
    Then Click on Action Details Pass Refer
    Then Click to Verify Images
    Then Close the Image
    Then Approve the Ref
    Then i Logout from PCFC

    Examples:
      |username | password|
      |galaxy55 |Login345 |
  @Regression
  Scenario Outline: Search Ref Number With Approver User
    Given I am on PCFC login page
    When I enter "<username>" and "<password>"
    Then I click sigin button
    Then click on pass management
    Then Click Pass Approval
    Then Enter Pass "Pass Refer" Number
    Then Click Search Button
    Then Verify the Data Present
    Then Click on Action Details Pass Refer
    Then Click to Verify Images
    Then Close the Image
    Then Approve the Ref
    Then i Logout from PCFC

    Examples:
      |username | password|
      |Approver |Login345 |

  @Regression
  Scenario Outline: Search Ref Number With ssduser User
    Given I am on PCFC login page
    When I enter "<username>" and "<password>"
    Then I click sigin button
    Then Click change Language
    Then click on pass management
    Then Click Pass Approval
    Then Enter Pass "Pass Refer" Number
    Then Click Search Button
    Then Verify the Data Present
    Then Click on Action Details Pass Refer
    Then Click to Verify Images
    Then Close the Image
    Then Approve the Ref
    Then i Logout from PCFC

    Examples:
      |username | password|
      |ssduser  |Login@345 |




  @Regression
  Scenario Outline: Print Detail Ref Number With Fatima User
    Given I am on PCFC login page
    When I enter "<username>" and "<password>"
    Then I click sigin button
    Then click on pass management
    Then Click print Pass
    Then Enter Pass "Pass Refer" Number
    Then Click Search Button
    Then Click Chebox on ref
    And Accept the Alert
#    Then i Logout from PCFC

    Examples:
      |username | password|
      |Fatima |Login345 |