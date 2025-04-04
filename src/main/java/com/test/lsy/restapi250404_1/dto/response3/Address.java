package com.test.lsy.restapi250404_1.dto.response3;

import lombok.Data;

@Data
public class Address{
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private Geo geo;
}