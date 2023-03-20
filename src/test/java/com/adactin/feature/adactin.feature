Feature:  Booking hotel in adactin web page

Scenario: user login web page
Given     user launching adactin hotel app
When      user enters username
And  	  user enters password
Then      user click login to next page search hotel

Scenario: user search hotel
When      user select location from dropdown
And       user select hotel from dropdown
And       user select roomtype from dropdown
And       user select number of rooms from dropdown
And       user enters check in date
And       user enters check out date
And       user select adults per room
And       user select childrens per room
Then      user click seach button to navigate select hotel

Scenario: user select hotel
When      user select radio button
Then      user click to continue to navigate book a hotel

Scenario: user booking hotel
When      user enter firstname
And       user enter lastname
And       user enter billing address
And       user enter card number
And       user select card type from drop down
And       user select expiry date from drop down
And       user enter cvv number
Then      user click book now button to navigate booking confirmation

Scenario: user checking confirmation status
Then      user click logout 
           
