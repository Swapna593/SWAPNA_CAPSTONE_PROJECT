Feature: validate login page
@Priority1
Scenario Outline:Check for valid and invalid credentials

Given login page should be open in default browsers
When click on username button and enter username
And click on continue button
And enter the password
And click on signin button
Then login successfully

