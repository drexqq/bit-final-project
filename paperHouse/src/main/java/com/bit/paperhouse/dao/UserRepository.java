package com.bit.paperhouse.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.bit.paperhouse.dto.UserDto;
import com.bit.paperhouse.model.CustomSecurityDetails;


@Mapper
@Repository 
public interface UserRepository {
	
    public void regi( UserDto dto );
	
	
	public CustomSecurityDetails findByid( String username );

}
