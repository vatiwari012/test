package com.test.url.data;

public class totaldata {


	
	public totaldata() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String url;
	private int page;
	
	public totaldata(String url, int page) {
		super();
		this.url = url;
		this.page = page;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}

}
