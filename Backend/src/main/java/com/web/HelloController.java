package com.web;

import com.web.dto.HelloRequestDto;
import com.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @ResponseBody
    @GetMapping("/api/v1/hello")
    public HelloResponseDto Hello() {
        HelloResponseDto sampleDto = HelloResponseDto.builder().name("홍길동").build();
        return  sampleDto;
    }

    @ResponseBody
    @PostMapping("/api/v1/hello/say")
    public String SayHello(@RequestBody HelloRequestDto requestDto) {
        return String.format("Hello %s", requestDto.getName());
    }
}
