package com.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient(name = "battcn-feign-hello")
public interface HelloClient {

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/hello")
    String findStudentByName(@PathVariable("name") String name);

}