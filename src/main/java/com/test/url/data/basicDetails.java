package com.test.url.data;

public class basicDetails {
	
	private String url ;
	private int usage ;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getUsage() {
		return usage;
	}
	public void setUsage(int usage) {
		this.usage = usage;
	}
	public basicDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public basicDetails(String url, int usage) {
		super();
		this.url = url;
		this.usage = usage;
	}
}
