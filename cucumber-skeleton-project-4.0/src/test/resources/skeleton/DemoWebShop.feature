Feature: DemoWebShop

Scenario Outline: Testing Multiple Logins
Given DemoWebShop App is opened
And signin page is displayed
When I provide "<Login>" and "<Password>"
Then the relevant Login and Username is displayed

Examples: 
|Login|Password| 
|nadh@gmail.com|navin123| 
|namsh@gmail.com|navin123|
