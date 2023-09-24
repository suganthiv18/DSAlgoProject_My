Feature: Feature to test the SigIn Page

Scenario: Check if SignIn is successful

Given user is on Login page
When user clicks Register
Then user is navigated to the register page

Given user is on Login page
When Pass inputs from excel sheet
Then click login button 


Given user is on Login page
When The user enter invalid "<username>" and "<password>"
Then click login button to verify
    
  Examples: 
      | username | password |
      | test | test |
      |alchemyteam|Numpy@Ninja|
      
