Feature: Search feature of the web page

  Scenario: Search based on Tablets
    Given I am at the home page
    When I click on the "Tablets" Option
    Then I should able to see Mobile Phones sales page
    And The title should be "Mobile Phones Republic Day Sales" 
    Then I click on one mobile 
    Then I should able to redirect to same mobile sales page

  #Scenario: Search based on Fashion
    #Given : I am at the home page
    #When : I click on the "Fashion" search filter
    #Then : I should be at the "Fashion" search page with "35 items"
    #And : The title should be "Fashion" search page
#
  #Scenario: Search based on Cameras
    #Given : I am at the home page
    #When : I click on the "Cameras" search filter
    #Then : I should be at the "Cameras" search page with "47 items"
    #And : The title should be "Cameras" search page

