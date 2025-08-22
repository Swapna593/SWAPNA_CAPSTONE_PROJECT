Feature: Check Online Banking 
Scenario: Online Banking and Statement Download 
Given zero bank home page should be available with
When click on online banking hyperlink then click on online statements
And select savings from dropdownlist then select year and click on statements for downloading
Then statement downloaded 