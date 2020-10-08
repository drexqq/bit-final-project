package com.bit.paperhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.paperhouse.dto.SearchDto;
import com.bit.paperhouse.dto.WriterDto;
import com.bit.paperhouse.service.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService searchService;
	
	@RequestMapping(value = "/getSearchList")
	public List<WriterDto> getSearchList(SearchDto searchDto) {
		if(searchDto.getSearchSort() == null || searchDto.getSort() == null) {
			searchDto.setSearchSort("NAME");
			searchDto.setSort("ASC");
		}
		System.out.println(searchDto.toString());
		//List<WriterDto> list = searchService.getSearchWriter(searchDto);
		
		return null;
	}
}
