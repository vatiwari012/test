package com.test.url.data;

public class urlData {


	
	public urlData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String url;
	private String urlShortKey;
	private int usageCount;
	
	public urlData(String url, String urlShortKey, int usageCount) {
		super();
		this.url = url;
		this.urlShortKey = urlShortKey;
		this.usageCount = usageCount;
	}
	
	public urlData(String url, int usageCount) {
		super();
		this.url = url;
		this.usageCount = usageCount;
	}
	
	public String getUrlShortKey() {
		return urlShortKey;
	}
	public void setUrlShortKey(String urlShortKey) {
		this.urlShortKey = urlShortKey;
	}
	public int getUsageCount() {
		return usageCount;
	}
	public void setUsageCount(int usageCount) {
		this.usageCount = usageCount;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


}
