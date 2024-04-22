package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PhonebookVo;

@RestController
public class PhonebookController {
	
	@Autowired
	private PhonebookService ps;
	
	@GetMapping("api/list")
	public List<PhonebookVo> list() {
		
		return ps.list();
	}
	
}
