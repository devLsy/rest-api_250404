package com.test.lsy.restapi250404_1.controller;

import com.test.lsy.restapi250404_1.dto.response1.Response;
import com.test.lsy.restapi250404_1.dto.response2.Response2;
import com.test.lsy.restapi250404_1.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "User API", description = "사용자 API")
public class UserController {

    private final UserService service;

    @GetMapping("/v1/1")
    public Response getUsers() {
        return service.getUsers();
    }

    @GetMapping("/v1/2")
    public Response2 getUsers2() {
        return service.getUsers2();
    }
}
