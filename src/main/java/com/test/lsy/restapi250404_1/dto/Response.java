package com.test.lsy.restapi250404_1.dto;

import java.util.List;
import lombok.Data;

@Data
public class Response{
	private List<ResultsItem> results;
	private Info info;
}