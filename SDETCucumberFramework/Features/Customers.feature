Feature: Customer

Scenario: Add new customer
          Given User Launch Chrome browser 
	      When User opens URL "http://admin-demo.nopcommerce.com/login" 
	      And User enters Email as "admin@yourstore.com" and Password as "admin" 
	      And Click on Login 
	      Then  User can view Dashboard
          When  user click on customer menu
          And Click on Customer menu item
          And click on add new button
          Then user can view  add new customer page
          When user enter the customer infomation
          And click on save button
          Then user can view the confirmation message "The new customer has been added successfully."
          And close the browser 
          
          
Scenario: Seach customer By Email-Id
          Given User Launch Chrome browser 
	      When User opens URL "http://admin-demo.nopcommerce.com/login" 
	      And User enters Email as "admin@yourstore.com" and Password as "admin" 
	      And Click on Login 
	      Then  User can view Dashboard
          When User click on customer menu
          And click on customer menu
          And Enter customer Email
          When click on search button
          Then User should found Email in the search table 
          And close the browser