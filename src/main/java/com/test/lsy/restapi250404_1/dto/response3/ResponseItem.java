package com.test.lsy.restapi250404_1.dto.response3;

import lombok.Data;

@Data
public class ResponseItem{
	private int id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
}