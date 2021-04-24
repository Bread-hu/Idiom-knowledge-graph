package com.kg.idiomknowledgegraph.controller;

import com.alibaba.fastjson.JSONObject;
import com.kg.idiomknowledgegraph.service.ChengYuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdiomKGController {

	@Autowired
	ChengYuService chengYuService;


	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}

	@RequestMapping(value = "/getdata", method = RequestMethod.POST)
	public JSONObject getdata(@RequestBody String param) {
		JSONObject in = JSONObject.parseObject(param);
		System.out.println(in.get("name"));
		JSONObject out = new JSONObject();
		out.put("namne", "zhangsan");
		out.put("score", 80);
		return out;
	}

}
