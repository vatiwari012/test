package com.test.url.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.url.data.basicDetails;

import com.test.url.data.urlData;
@Service
public class UrldetailImpl implements urldetail {

	List<urlData> list;
	List<basicDetails> view;
	public UrldetailImpl() 
	{
		list = new ArrayList<>();
		view= new ArrayList<>();
		list.add(new urlData("cjb","c1.com",0));
	}
	

	@Override
	public String saveUrl(String urlName,int keyId,int usedCount) {
		// TODO Auto-generated method stub
		String key = shortKeyId(urlName,keyId);
		list.add(new urlData(urlName, key, usedCount));
		view.add(new basicDetails(urlName,usedCount));
		return key;
	}
	
	public String shortKeyId(String urlId,int count)
	{
		int b = (int)(Math.random()*(1000));  
		return count+"_"+b;
	}
	
	@Override
	public urlData getUrl(String value) {
		// TODO Auto-generated method stub
		urlData data= null;
		for(urlData id:list)
		{
			if(id.getUrl().equals(value))
				{	data=id;
					break;
				}
		}
		System.out.println("value");
		return data ;
	}

	@Override
	public String returnUniqueKey(String url) {
		// TODO Auto-generated method stub
		urlData data = null;
		for(urlData id: list)
		{
			if(id.getUrl().equals(url))
				{
				data=id;
				int count = data.getUsageCount();
				data.setUsageCount(++count);
				return data.getUrlShortKey();
				}
		}
		
		return "Url Not found";
	}
	
	@Override
	public int returnUrlUsage(String url) {
		// TODO Auto-generated method stub
		
		for(urlData id: list)
		{
			if(id.getUrl().equals(url))
				{
				return id.getUsageCount();
				}
		}
		
		return -1;
	}


	@Override
	public List<urlData> getList() {
		// TODO Auto-generated method stub
		
		return list;
	}
	
	@Override
	public List<basicDetails> getbasicDetails() {
		// TODO Auto-generated method stub
		
		return view;
	}
	
	
	@Override
	public List<basicDetails> getList(int page,int size, int pageCount) {
		// TODO Auto-generated method stub
		int totalPages = 1;
		if(view.size()>pageCount)
			totalPages = (int) Math.ceil(view.size()/pageCount) + 1;
		if(page<=totalPages)
		if(page==1)
		{
		if(pageCount>list.size() && view.size()<=size)
			return view.subList(0, view.size());
		else
			return view.subList(0, size);
		}
		else if((page*pageCount>view.size() && view.size()>=pageCount*(page-1)) && size<view.size())
		{	
			if(list.size()>=size)
				return view.subList((page-1)*pageCount, size);
			else
				return view.subList((page-1)*pageCount, view.size());
			
		}
				
		return null;
			
		
	}


}
