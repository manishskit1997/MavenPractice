Feature: Application login

Scenario: Admin page default login

Given user is on netbanking landing page
When user login application
Then home page is displayed 
And card is displayed 
