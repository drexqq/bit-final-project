package com.bit.paperhouse.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bit.paperhouse.dao.SearchRepository;
import com.bit.paperhouse.dto.WriterDto;

@Service
@Transactional
public class SearchService {

	@Autowired
	SearchRepository searchRepository;
	
	public List<WriterDto> getSearchWriter(HashMap<String, Object>map) {
		List<WriterDto> list = searchRepository.getSearchWriter(map);
		return list;
	}
	
}
