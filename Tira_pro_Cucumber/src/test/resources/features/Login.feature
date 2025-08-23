Feature:Validate login 
Scenario:User able to login with number 
Given Login page should be open in default browser
When enter input as number
And click on sendOTP
Then successful login after entering OTP
