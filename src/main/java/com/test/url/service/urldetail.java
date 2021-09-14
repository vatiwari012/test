package com.test.url.service;

import java.util.List;

import com.test.url.data.basicDetails;
import com.test.url.data.urlData;

public interface urldetail {

	public List<urlData> getList();
	
	public List<basicDetails> getbasicDetails();
	public List<basicDetails> getList(int page,int size,int p);
	
	public urlData getUrl(String value);

	public String saveUrl(String url, int keyId,int usage);

	public String returnUniqueKey(String url);

	public int returnUrlUsage(String url);
}
