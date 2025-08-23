Feature:Check user is able to search 
@Priority2
Scenario Outline: Verify search works
Given search page is open
When click on search bar
And enter the items <item>
Then search items successfully
Examples:
|item|
|watch|
|phone|