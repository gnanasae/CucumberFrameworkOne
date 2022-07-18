Feature: searching for the product in Greenkart

Scenario Outline: searching experience for product match
Given user is on the GreenKart home page 
When user search for <productName> related product is displayed and actual name is extracted
And user navigates to top deals and search for <productName>
Then validating both for product match 
Examples:
|	productName	|
| 		Tom			|
|			Beet		|


Scenario:
 search product and add to cart

Given user is on the GreenKart home page
When user search for "Brocolli"
Then add how much quantity is required and add the product to the cart
Then go to cart and click on the proceed to check out
And verify the product "Brocolli"
Then place the order 
And select the country 





