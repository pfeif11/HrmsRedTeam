#Author: Red Team
Feature: Add Work Experience

	@smoke
  Scenario: 
    Given user navigates to Hrms is logged in as Admin
    When user navigates to employee list
    And user searches employee by id number "11331" and clicks on employee
    And user clicks on Qualifications tab and clicks on Add button under Work Experience
    Then user enters the following details and user clicks save button and sees work experience added to list
      | Company     | JobTitle               | FromDate    | ToDate      | Comment                                                                                                                                                      |
      | Apple       | QA Automation Engineer | 2011-Jun-05 | 2014-Nov-13 | Use established agile processes to work within the scrum teams to maximize coverage of automated tests, and fill in where necessary with manual test scripts |
      | Capital One | QA Tester              | 2014-Dec-15 | 2018-May-20 | Develop and executes test procedures and test cases and perform integration of system components                                                             |
    
