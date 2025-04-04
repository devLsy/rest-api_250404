package com.test.lsy.restapi250404_1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.lsy.restapi250404_1.dto.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final ObjectMapper om;
    @Value("${user.json}")
    private String jsonStr;

    public Response getUsers() {
        try {
            return om.readValue(jsonStr, Response.class);
        } catch(Exception e) {
            log.error("json 파싱 오류", e);
            throw new RuntimeException("JSON 파싱 중 오류 발생");
        }
    }
}
