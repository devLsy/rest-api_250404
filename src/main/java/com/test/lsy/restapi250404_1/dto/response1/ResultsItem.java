package com.test.lsy.restapi250404_1.dto.response1;

import lombok.Data;

@Data
public class ResultsItem{

	private String gender;
	private Name name;
	private Location location;
	private Login login;
	private String email;
	private Picture picture;
}