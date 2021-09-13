package com.test.url.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.url.data.totaldata;
@Service
public class Urldetali implements urlname {

	List<totaldata> list;
	
	public Urldetali() 
	{
		list = new ArrayList<>();
		list.add(new totaldata("cjb",0));
	}
	
	@Override
	public List<totaldata> getList() {
		// TODO Auto-generated method stub
		
		return list;
	}


	@Override
	public totaldata getUrl(String value) {
		// TODO Auto-generated method stub
		totaldata data= null;
		for(totaldata id:list)
		{
			if(id.getUrl().equals(value))
				data=id;
				break;
		}
		System.out.println("value");
		return data ;
	}

	@Override
	public String saveUrl(String urlName) {
		// TODO Auto-generated method stub
		list.add(new totaldata(urlName, 0));
		
		return "Url Save";
	}
	
	
}
