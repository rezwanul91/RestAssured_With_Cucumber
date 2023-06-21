Feature: Verify Product category CRUD functionalities

@Sanity
Scenario: Product category CRUD functionalities
Given I generate all test random value
* I create a category
* I verify category id and name 
* I update category with ABCD1234 as category name
* I verify updated category name
* I delete that category
* I veriy category is deleted