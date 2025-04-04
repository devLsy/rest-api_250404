package com.test.lsy.restapi250404_1.dto.response1;

import lombok.Data;

@Data
public class Location{
	private String country;
	private String city;
	private Street street;
	private Timezone timezone;
	private String  postcode;
	private Coordinates coordinates;
	private String state;
}