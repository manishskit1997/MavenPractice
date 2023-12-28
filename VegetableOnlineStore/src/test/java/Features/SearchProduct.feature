Feature: serach and place the order for product

Scenario Outline: Seach exprince for product serach in both home and offers page.
Given user is on Greencart landing page
When user serach with shortname <Name> and extracted actual name of prodct
Then user serach with same shortname <Name> in offers page 
And check if product exits with same name
Examples:
|Name|
|Tom|
|Beet|


