 @login-feature
Feature: Invalid Login

  Scenario Outline: Invalid UserName
			When I enter username as "<username>"
			And  I enter password as "<password>"
			And  I login
			Then login should fail with error "<errorMessage>"			

    Examples: 
      | username  | 	password 					| errorMessage  			|
      | name1 		|   currentPassword 	| Invalid Credential 	|
      | name2 		|   curerntPassword 	| Invalid Credential	|
