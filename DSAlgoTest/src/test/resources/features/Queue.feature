Feature: Testing the Queue Page
  
   @QueuePage01
  Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user in queue page
    When The user clicks on Implementation of queue in python link
    Then The user should be directed to Implementation of Queue in Python page

  @QueuePage02
  Scenario: The user should be directed to editor page with run button to test python code
    Given The user is in Implementation of queue in python link page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button
    
  @QueuePage03
  Scenario Outline: The user is able run code in Editor for Valid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<ValidPythonCode>" 
    And clicks run button
    Then The user is presented with the result after run button is clicked

 		 Examples: 
       | ValidPythonCode  |
       | print 'Hello' | 
 
  @QueuePage04
  Scenario Outline: The user is able run code in Editor for Invalid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<InvalidPythonCode>"
    And clicks run button
    Then The user gets an error message

      Examples: 
      | InvalidPythonCode  |
      | Hello | 

      @QueuePage05
  Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
    Given The user in editor page and navigates to the queue page
    When The user clicks on Implementation using collections deque link
    Then The user should be redirected to Implementation using collections deque page

   @QueuePage06
  Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page
    Given The user in implementation using collections page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button
   
    @QueuePage07
  Scenario Outline: The user is able run code in Editor for Valid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<ValidPythonCode>"
    Then The user is presented with the result after run button is clicked

    Examples: 
       | ValidPythonCode  |
       | print 'Hello' | 
       
       
  @QueuePage08
  Scenario Outline: The user is able run code in Editor for Invalid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<InvalidPythonCode>" 
    And clicks run button
    Then The user gets an error message

    Examples: 
      | InvalidPythonCode  |
      | Hello | 
      
      @QueuePage09
  Scenario: The user is able to navigate to queue page and click on Implementation using array link
    Given The user in editor page and navigates to the queue page
    When The user clicks on Implementation using array link
    Then The user should be redirected to Implementation using array page

  @QueuePage10
  Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
    Given The user in implementation using array page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button

  @QueuePage11
  Scenario Outline: The user is able run code in Editor for Valid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<ValidPythonCode>"
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
     | ValidPythonCode  |
     | print 'Hello' | 

  @QueuePage12
  Scenario Outline: The user is able run code in Editor for Invalid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<InvalidPythonCode>" 
    Then The user gets an error message

    Examples: 
       | InvalidPythonCode  |
       | Hello | 
      
  @QueuePage14
  Scenario: The user should be directed to editor page with run button to test python code from Queue Operations page
    Given The user in Queue Operations page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button

   @QueuePage15
  Scenario Outline: The user is able run code in Editor for Valid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<ValidPythonCode>" 
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
       | ValidPythonCode  |
       | print 'Hello' | 

  @QueuePage16
  Scenario Outline: The user is able run code in Editor for Invalid Python Code
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<InvalidPythonCode>" 
    And clicks run button
    Then The user gets an error message

    Examples: 
      | InvalidPythonCode  |
      | Hello | 

  @QueuePage17
  Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
    Given The user is in Editor page and navigates to QueueOp page
    When the user clicks on Practice Questions
    Then The user is directed to Practice page

