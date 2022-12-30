package com.news18.api.init;

public class ProjectLibrary {
	
	String streamUrl;
	public String getStreamUrl() {
		return streamUrl;
	}
	public void setStreamUrl(String streamUrl) {
		this.streamUrl = streamUrl;
	}
	public ProjectLibrary(String streamUrl) {
		
		this.streamUrl = streamUrl;
	}

}
