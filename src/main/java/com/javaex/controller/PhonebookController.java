package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PhonebookVo;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PhonebookController {
	
	@Autowired
	private PhonebookService ps;
	
	@GetMapping("api/list")
	public JsonResult list() {
		
		return ps.list();
	}
	
	@GetMapping("api/list/{no}")
	public JsonResult getMethodName(@PathVariable(value="no") int no) {
		return ps.listOne(no);
	}
	
	@PostMapping("api/persons")
	public JsonResult insert(@RequestBody PhonebookVo pv) {
		return ps.insert(pv);
	}
	
	@PostMapping("api/del/{no}")
	public JsonResult delete(@PathVariable(value = "no") int no) {
		System.out.println(no);
		return ps.del(no);
	}
	
	@PostMapping("api/modify")
	public JsonResult modify(@RequestBody PhonebookVo pv) {
		System.out.println(pv);
		return ps.modify(pv);
	}
}
