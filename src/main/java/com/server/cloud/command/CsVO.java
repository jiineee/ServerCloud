package com.server.cloud.command;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CsVO {

	private String cs_num;
	private String cs_title;
	private String cs_content;
	private String cs_writer;
	private Timestamp cs_regdate;
	private String cs_answer_yn;
	private String cs_type;
	private String cs_target;
	
	
	
}
