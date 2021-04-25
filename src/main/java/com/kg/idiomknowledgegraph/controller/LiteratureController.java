package com.kg.idiomknowledgegraph.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kg.idiomknowledgegraph.dao.LiteratureDao;
import com.kg.idiomknowledgegraph.domain.ChengYu;
import com.kg.idiomknowledgegraph.domain.ChengYuMini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LiteratureController {

	@Autowired
	private LiteratureDao literatureDao;

	@RequestMapping(value = "/literatures", method = RequestMethod.POST)
	public JSONArray getliteratures(@RequestBody String param) {

		JSONArray out = new JSONArray();
		return out;
	}

	@RequestMapping(value = "/getLiteraturesById", method = RequestMethod.POST)
	public JSONObject getLiteraturesById(@RequestBody String param) {
		JSONObject in = JSONObject.parseObject(param);
		int id=in.getInteger("id");
		JSONObject out = new JSONObject();

		return out;
	}

}
