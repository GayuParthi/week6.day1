Feature: Leaftaps  CreateContact functionality


Background: 
Given Open the chrome browser
And Load the application url as 'http://leaftaps.com/opentaps'
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login 
And Click on Homepage

Scenario Outline: Create Contact
When Click on Contacts Button
And Click on Create Contact Button
Given Enter FirstName Field
And Enter LastName Field
And Enter createContactForm_firstNameLocal as <firstNameLocal>
And Enter createContactForm_lastNameLocal as <lastNameLocal>
And Enter createContactForm_departmentName
And Enter createContactForm_description
And Enter createContactForm_primaryEmail
And Enter createContactForm_generalStateProvinceGeoId
When Click on smallSubmit
And Click Edit
And UpdateContactForm_description
Given UpdateContactForm_importantNote
Then Click Update

Examples:
|firstNameLocal|lastNameLocal|
|'Sudheera'|'Shri'|