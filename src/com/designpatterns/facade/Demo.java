package com.designpatterns.facade;

public class Demo {
  public static void main(String[] args) {
    show();
  }
  public static void show() {
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(accessToken);
  }
}
