package com.test.lsy.restapi250404_1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.lsy.restapi250404_1.dto.response1.Response;
import com.test.lsy.restapi250404_1.dto.response2.Response2;
import com.test.lsy.restapi250404_1.dto.response3.Response3;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final ObjectMapper om;
    @Value("${user.json1}")
    private String jsonStr1;

    @Value("${user.json2}")
    private String jsonStr2;

    @Value("${user.json3}")
    private String jsonStr3;

    public Response getUsers() {
        try {
            return om.readValue(jsonStr1, Response.class);
        } catch(Exception e) {
            log.error("json 파싱 오류", e);
            throw new RuntimeException("JSON 파싱 중 오류 발생");
        }
    }

    public Response2 getUsers2() {
        try {
            return om.readValue(jsonStr2, Response2.class);
        } catch(Exception e) {
            log.error("json 파싱 오류", e);
            throw new RuntimeException("JSON 파싱 중 오류 발생");
        }
    }

    public List<Response3> getUsers3() {
        try {
            return om.readValue(jsonStr3, new TypeReference<List<Response3>>() {});
        } catch(Exception e) {
            log.error("json 파싱 오류", e);
            throw new RuntimeException("JSON 파싱 중 오류 발생");
        }
    }
}
