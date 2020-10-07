package com.bit.paperhouse.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto implements Serializable {

	private int write_seq;
	private int article_seq;
	private String title;
	private String content;
	private String date;
	private int viewCount;
	private int like;
	private String category;
	private String fileOrigin_name;
	private String file_system;
	
}
