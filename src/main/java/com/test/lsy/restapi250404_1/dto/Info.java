package com.test.lsy.restapi250404_1.dto;

import lombok.Data;

@Data
public class Info{
	private String seed;
	private int page;
	private int results;
	private String version;
}