package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.util.JsonResult;
import com.javaex.vo.PhonebookVo;

@Service
public class PhonebookService {

	@Autowired
	private PhonebookDao phone;
	
	public JsonResult list() {
		
		List<PhonebookVo> pList = phone.list();
		
		if(pList != null) {
			return JsonResult.success(pList);
		}else {
			return JsonResult.fail("실패했습니다");
		}
		
		
	}
	
	public JsonResult listOne(int no) {
		
		PhonebookVo pv = phone.listOne(no);
		
		if(pv != null) {
			return JsonResult.success(pv);
		}else {
			return JsonResult.fail("실패했습니다");
		}
	}
	
	public JsonResult insert(PhonebookVo pv) {
		
		int a = phone.insert(pv);
		
		if(a == 1) {
			return JsonResult.success(a);
		}else {
			return JsonResult.fail("실패했습니다");
		}
	}
	
	public JsonResult del(int no) {
		System.out.println(no);
		int a = phone.del(no);
		if(a == 1) {
			return JsonResult.success(a);
		}else {
			return JsonResult.fail("실패했습니다");
		}
	}
	
	public JsonResult modify(PhonebookVo pv) {
		int a = phone.modify(pv);
		if(a == 1) {
			return JsonResult.success(a);
		}else {
			return JsonResult.fail("실패했습니다");
		}
	}
}
