package com.bit.paperhouse.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class WriterDto implements Serializable {

	private int user_seq;
	private int writer_seq;
	private String name;
	private String intro;
	private String fileOriginal_name;
	private String file_system;
	private int status;
	
	//user subscribe dto 대신 writerDto 사용
	private String startDate;
	private String endDate;
	
}
