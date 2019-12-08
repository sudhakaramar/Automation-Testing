@tag
Feature: Title of your feature
  I want to use this template for my feature file

  
  


Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
    | pbunny     | padala |
	Then Message displayed Login Successfully