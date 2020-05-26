package com.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HelloResponseDto {
    private String Name;

    @Builder
    public HelloResponseDto(String name) {
        this.Name = name;
    }
}
