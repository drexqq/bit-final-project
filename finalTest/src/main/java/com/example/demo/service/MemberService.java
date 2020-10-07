package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.MemberDao;
import com.example.demo.dto.MemberDto;

@Service
@Transactional
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public MemberDto login( MemberDto dto) {
		
		return dao.login(dto);
	}
	
}
