package com.test.url.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.url.data.totaldata;
import com.test.url.service.urlname;

@RestController
public class controller 
{
	@Autowired
	public urlname name;
	
	@PostMapping("/storeurl")
	@ResponseBody
	public String saveUrl(@RequestParam String url)
	{
		
		return this.name.saveUrl(url);
	}
	
	
	@GetMapping("/list")
	public List<totaldata> getList()
	{
		return this.name.getList();
	}
	
	@GetMapping("/list/{urlId}")
	public totaldata getname(@PathVariable String urlId)
	{
		return this.name.getUrl(urlId);
	}
	
	
	
	
//	`	 http://localhost:8080/storeurl?url=google.com
//
//		 http://localhost:8080/get?url=google.com
//
//		 http://localhost:8080/count?url=google.com
//
//		 http://localhost:8080/list?page=1&size=2

	
	
}
