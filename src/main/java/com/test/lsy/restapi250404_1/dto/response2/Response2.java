package com.test.lsy.restapi250404_1.dto.response2;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response2 {
	@JsonProperty("per_page")
	private int perPage;
	private int total;
	private List<DataItem> data;
	private int page;
	@JsonProperty("total_pages")
	private int totalPages;
	private Support support;
}