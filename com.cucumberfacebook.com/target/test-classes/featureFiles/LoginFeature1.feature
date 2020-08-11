Feature: Testing the CreatePost module for uploading posts

Scenario Outline:
Given browser is opened
Given Application is loaded
When the user enters the valid "<username>" and "<password>"
And the user clicks on Login button
Then HomePage is displayed
When the user clicks on CreatePost
And user click on emoji icon and select one emoji symbol to Post
And user clicks on TagFriends and tag one of the "<Friend>"
When user clicks on more button
When user clicks on Watch party and add videos to the post
Then WatchParty page is displayed
And user clicks on Post to upload the Post
And user clicks his Timeline to verify whether post is uploaded or not
Then Timeline is displayed
When user Clicks on Logout
Then Login page is displayed
Examples:
|username|password|Friend|
|7286965251|Subhash@1|chenna rao|



