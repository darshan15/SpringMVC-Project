package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit() {
		return"Ok... You can take my Makeup Kit!";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks() {
		return "Math Book.";
	}
}
