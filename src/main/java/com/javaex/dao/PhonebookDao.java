package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PhonebookVo;

@Repository
public class PhonebookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<PhonebookVo> list() {
		
		return sqlSession.selectList("phonebook.list");
	}
	
	public PhonebookVo listOne(int no) {
		
		return sqlSession.selectOne("phonebook.listone", no);
	}
	
	public int insert(PhonebookVo pv) {
		
		return sqlSession.insert("phonebook.insert", pv);
	}
	
	public int del(int no) {
		return sqlSession.delete("phonebook.del", no);
	}
	
	public int modify(PhonebookVo pv) {
		return sqlSession.update("phonebook.modify", pv);
	}
}
