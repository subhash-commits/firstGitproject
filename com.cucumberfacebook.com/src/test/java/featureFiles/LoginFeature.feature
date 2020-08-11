Feature: Testing the Login Feature of Facebook  Application


Scenario Outline:
Given browser is opened
Given Application is loaded
When the user enters the valid "<username>" and "<password>"
And the user clicks on Login button
Then HomePage is displayed
When the user clicks on CreatePost
And the user clicks on Textarea and Write "<Message>"
And user click on emoji icon and select one emoji symbol to Post
And user clicks on BackgroundStyles and add backgroound style to post
And user clicks on TagFriends and tag one of the "<Friend>"
And user clicks on Checkin and add "<location>" to post
And user clicks on Feeling/Activity and add "<feeling>" to the post
And user clicks on Post to upload the Post
And user clicks his Timeline to verify whether post is uploaded or not
Examples: 
|username|password||Message|Friend|location|feeling|
|7286965251|Subhash@1||hii,how are you|chenna rao|hyderabad|sad|
