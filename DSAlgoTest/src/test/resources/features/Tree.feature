Feature: Testing the Tree Page

  @TreePage01
  Scenario: The user is able to navigate to Overview of Trees page
    Given The user is on the Tree page after logged in
    When The user clicks on the Overview of Trees link
    Then The user should be directed to the Overview of Trees of tree Page

  @TreePage02
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is on the overview of trees after logged in
    When The user clicks Try Here button in a tree page
    Then The user should be redirected to a page having tryEditor with a Run button to test

  @TreePage03
   Scenario: The user is able run code in Editor for Valid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<ValidPythonCode>" 
    And clicks run button
    Then The user is presented with the result after run button is clicked

 		 Examples: 
       | ValidPythonCode  |
       | print 'Hello' | 

  @TreePage04
  Scenario: The user is able run code in Editor for Invalid Python Code
     Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<InvalidPythonCode>"
    And clicks run button
    Then The user gets an error message

      Examples: 
      | InvalidPythonCode  |
      | Hello | 

  