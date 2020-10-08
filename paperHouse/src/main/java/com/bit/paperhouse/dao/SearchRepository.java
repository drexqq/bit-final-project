package com.bit.paperhouse.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.bit.paperhouse.dto.SearchDto;
import com.bit.paperhouse.dto.WriterDto;

@Mapper
@Repository
public interface SearchRepository {

	public List<WriterDto> getSearchWriter(SearchDto searchDto);
}
