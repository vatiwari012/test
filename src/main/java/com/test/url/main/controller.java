package com.test.url.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.url.data.basicDetails;
import com.test.url.data.urlData;
import com.test.url.service.urldetail;


@RestController
public class controller 
{
	@Autowired
	public urldetail name;
	int count=0;
	final int usage = 0;
	
	@PostMapping("/storeurl")
	@ResponseBody
	public String saveUrl(@RequestParam String url)
	{
		return this.name.saveUrl(url,count++,usage);
	}
	
	@PostMapping("/get")
	@ResponseBody
	public String getUrl(@RequestParam String url)
	{
		return this.name.returnUniqueKey(url);
	}
	
	@PostMapping("/count")
	@ResponseBody
	public int getCount(@RequestParam String url)
	{
		return this.name.returnUrlUsage(url);
	}
	
	
	@PostMapping("/list")
	@ResponseBody
	public List<basicDetails> getListCount(@RequestParam int page,int size)
	{
		return this.name.getList(page,size,25);
	}
	
	
	@GetMapping("/list")
	public List<basicDetails> getbasicDetails()
	{
		
		return this.name.getbasicDetails();
	}
	
	@GetMapping("/list/{urlId}")
	public urlData getname(@PathVariable String urlId)
	{
		return this.name.getUrl(urlId);
	}
	
	
}
