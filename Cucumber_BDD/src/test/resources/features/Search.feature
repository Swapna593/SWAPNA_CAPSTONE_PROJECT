Feature: check user is able to search multiple times 
Scenario Outline: verify search for multple searches 
Given login user and search button available
When Enter <item> and then use keyboard enter keys
Then List of output relevant to input
Examples:
|item|
|zero|
|gfjj|
|one|

