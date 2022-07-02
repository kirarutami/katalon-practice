# katalon-practice
 Practicing Katalon Studio with Udemy Course "Complete Katalon Studio 2020 for Web + API Test Automation"

 ### Learning Timestamp:

17/06/2022 Learn how to Web UI Test using 3 mode: record and playback, manual, and script.

18/06/2022 Learn how to rename objects

19/06/2022 Learn how to handle object types

27/06/2022 Learn object locators

28/06//2022 Learn about XPath 

note: // -> look anywhere in the document | / -> look element underneath

@ = attribute

example: //form[@id=="login_form"]//button -> look form with id = login_form anywhere in the document, then look button anywhere in the form

we can add 2 attributes on XPath, example: //input[@id='email' and @name'email]

contains = search for the text contain certain text, example: //input[contains(@id='email')] -> search anywhere that contains 'email' on id

the text on XPath is a sensitive case (uppercase lowercase calculated)

XPath axis -> parent, child, example: //form[@id=='login_form']/child::* | descendant : everything undernearth | ancestor: pick all ancestor | sibling: following all element sibling example: //form[@id=='login_form']/h3/following-sibling::* -> pick all h3 siblilng

02/07/2022 Learn CSS Locators

note: #login_form -> search element 'login form'

#login_form button -> search button underneath the login form

#login_form button[id^=Submit] -> search first id word 'Submit' for button underneath the login form

#login_form button[id$=Login] -> search second id word 'Login' for button underneath the login form

#login_form button[id*=mitLog] -> search word id contains 'mitLogin' for button underneath the login form





