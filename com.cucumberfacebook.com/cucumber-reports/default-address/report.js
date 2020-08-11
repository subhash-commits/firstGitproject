$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/featureFiles/LoginFeature1.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the CreatePost module for uploading posts",
  "description": "",
  "id": "testing-the-createpost-module-for-uploading-posts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "testing-the-createpost-module-for-uploading-posts;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Application is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters the valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "HomePage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on CreatePost",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on emoji icon and select one emoji symbol to Post",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on TagFriends and tag one of the \"\u003cFriend\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on more button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on Watch party and add videos to the post",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "WatchParty page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on Post to upload the Post",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks his Timeline to verify whether post is uploaded or not",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Timeline is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user Clicks on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Login page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "testing-the-createpost-module-for-uploading-posts;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Friend"
      ],
      "line": 21,
      "id": "testing-the-createpost-module-for-uploading-posts;;;1"
    },
    {
      "cells": [
        "7286965251",
        "Subhash@1",
        "chenna rao"
      ],
      "line": 22,
      "id": "testing-the-createpost-module-for-uploading-posts;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9971853000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "",
  "id": "testing-the-createpost-module-for-uploading-posts;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Application is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters the valid \"7286965251\" and \"Subhash@1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "HomePage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on CreatePost",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on emoji icon and select one emoji symbol to Post",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on TagFriends and tag one of the \"chenna rao\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on more button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on Watch party and add videos to the post",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "WatchParty page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on Post to upload the Post",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks his Timeline to verify whether post is uploaded or not",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Timeline is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user Clicks on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.browser_is_opened()"
});
formatter.result({
  "duration": 251331200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.application_is_loaded()"
});
formatter.result({
  "duration": 100200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7286965251",
      "offset": 27
    },
    {
      "val": "Subhash@1",
      "offset": 44
    }
  ],
  "location": "LoginStepDefinition.the_user_enters_the_valid_and(String,String)"
});
formatter.result({
  "duration": 390942000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 116168100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.homepage_is_displayed()"
});
formatter.result({
  "duration": 28654762800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_clicks_on_CreatePost()"
});
formatter.result({
  "duration": 14290018800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_emoji_icon_and_select_one_emoji_symbol_to_Post()"
});
formatter.result({
  "duration": 10885326400,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (f99c4a7efe6423b0deb54987638bb71a)] -\u003e xpath: //img[contains(@src,\u00271f619\u0027)]] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-7HNB2UR4\u0027, ip: \u0027192.168.43.60\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\SUBHAS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57061}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f99c4a7efe6423b0deb54987638bb71a\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.facebook.generic.GenericMethods.waitFor(GenericMethods.java:37)\r\n\tat com.facebook.PageObjects.TypeMessageAndPost.Emoji(TypeMessageAndPost.java:90)\r\n\tat stepDefinitionFiles.LoginStepDefinition.user_click_on_emoji_icon_and_select_one_emoji_symbol_to_Post(LoginStepDefinition.java:64)\r\n\tat ✽.And user click on emoji icon and select one emoji symbol to Post(./src/test/java/featureFiles/LoginFeature1.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "chenna rao",
      "offset": 46
    }
  ],
  "location": "LoginStepDefinition.user_clicks_on_TagFriends_and_tag_one_of_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_more_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Watch_party_and_add_videos_to_the_post()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.watchparty_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Post_to_upload_the_Post()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_his_Timeline_to_verify_whether_post_is_uploaded_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.timeline_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_Clicks_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 787365000,
  "status": "passed"
});
});