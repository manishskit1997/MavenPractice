Feature: place the order for product

Scenario Outline: Seach exprince for product serach in both home and offers page.
Given user is on Greencart landing page
When user serach with shortname <Name> and extracted actual name of prodct
And Added "3" item to selected product to cart
Then users proceeds to checkout and validate the <Name> item in checkout page
And verify user has ability to enter promo code and place the order 

Examples:
| Name |
| Tom |
