Feature: LeafTaps login functionality


Scenario Outline: Login with positive credential
Given Open the chrome browser
And Load the application <url> 
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|ur||username||password|

Scenario: