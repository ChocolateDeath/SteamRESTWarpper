package com.wrap.steam;

public class UserFriend {
	private String steamID,friendAge;
	
	public UserFriend() {
		this.steamID = "12345678912345678";
		this.friendAge = "-1";
	}
	public UserFriend(String steamID, String friendAge) {
		this.steamID = steamID;
		this.friendAge = friendAge;
		
	}
}
