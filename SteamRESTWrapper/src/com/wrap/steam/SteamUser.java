package com.wrap.steam;

import java.io.IOException;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SteamUser {
	
	private ImageIcon userIcon;
	private String SteamID,Username,profileURL,Status,timeOFF,communityVisibility,realName,
	accountAge, inGame;
	private LinkedList<UserFriend> friendsList = new LinkedList<UserFriend>();

	public SteamUser() {
		SteamID = Username = profileURL = Status = timeOFF = communityVisibility = realName
				= accountAge = inGame = "";
		
	}
	public SteamUser(String steamID) {
		populateUser(steamID);
		
	}

	public SteamUser(ImageIcon userIcon, String SteamID, String Username, String profileURL, String Status,
			String timeOFF, String communityVisibility, String realName, String accountAge, String inGame,
			LinkedList<UserFriend> friendsList) {
		super();
		this.userIcon = userIcon;
		this.SteamID = SteamID;
		this.Username = Username;
		this.profileURL = profileURL;
		this.Status = Status;
		this.timeOFF = timeOFF;
		this.communityVisibility = communityVisibility;
		this.realName = realName;
		this.accountAge = accountAge;
		this.inGame = inGame;
		this.friendsList = friendsList;
	}
	
	public void populateUser(String steamID) {
		//lookup URL
		UserLookUp newlookup = new UserLookUp(steamID);
		
		String jsonData = newlookup.openCon(); //JSON string
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode;
		
			 try {
				rootNode = mapper.readTree(jsonData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ImageIcon getUserIcon() {
		return userIcon;
	}
	public void setUserIcon(ImageIcon userIcon) {
		this.userIcon = userIcon;
	}
	public String getSteamID() {
		return SteamID;
	}
	public void setSteamID(String steamID) {
		SteamID = steamID;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getProfileURL() {
		return profileURL;
	}
	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getTimeOFF() {
		return timeOFF;
	}
	public void setTimeOFF(String timeOFF) {
		this.timeOFF = timeOFF;
	}
	public String getCommunityVisibility() {
		return communityVisibility;
	}
	public void setCommunityVisibility(String communityVisibility) {
		this.communityVisibility = communityVisibility;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAccountAge() {
		return accountAge;
	}
	public void setAccountAge(String accountAge) {
		this.accountAge = accountAge;
	}
	public String getInGame() {
		return inGame;
	}
	public void setInGame(String inGame) {
		this.inGame = inGame;
	}
	public LinkedList<UserFriend> getfriendsList(){
		return friendsList;
	}

	
}
