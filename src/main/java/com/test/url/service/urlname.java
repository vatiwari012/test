package com.test.url.service;

import java.util.List;

import com.test.url.data.totaldata;

public interface urlname {

	public List<totaldata> getList();
	
	public totaldata getUrl(String value);

	public String saveUrl(String urlName);
}
