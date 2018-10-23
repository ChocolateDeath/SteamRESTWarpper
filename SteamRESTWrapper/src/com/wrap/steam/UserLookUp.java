package com.wrap.steam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UserLookUp {
	private final String key = "?key=158B67489A103FB47D0B7BEA6B5C761E";
	private URL url;
	
	public  UserLookUp() {
		 url = null;
	}
	
	public UserLookUp(String steamID) {
		try {
			url = new URL("http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/"
					+ key + "&steamids=" + steamID );
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String openCon() {
		StringBuilder str = new StringBuilder();
		try {
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			BufferedReader buff = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String inputLine;
			while((inputLine = buff.readLine()) != null)
				str.append(inputLine);
			buff.close();
			con.disconnect();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return str.toString();
	}
	
	
	
}
