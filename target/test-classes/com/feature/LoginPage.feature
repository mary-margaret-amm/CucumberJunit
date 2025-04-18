Feature: Validation of Login Details
Scenario: Validate the valid username and password
Given Lauch the URL
When Enter the Username "MaryMargaret"
And Enter the password "maggy2009"
And Click the login Button
Then Validate the HomePage