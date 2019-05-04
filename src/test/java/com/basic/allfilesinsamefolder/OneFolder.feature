Feature: Facebook login
As a fb user, I want to enter username and pwd as

Scenario: validate fb login Scenario1
Given the user is on facebook login page
When he enters "anil" as user name
And he enters "pwd" as password
Then check username is presesnt in textbox


