package com.kavinduchamiran.spring.controller;

import com.kavinduchamiran.spring.beans.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	@Qualifier("kavinduMyBean")
	private MyBean myBean;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return myBean.getMessage();
	}

}
