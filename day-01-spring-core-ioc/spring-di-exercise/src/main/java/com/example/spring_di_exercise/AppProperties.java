package com.example.spring_di_exercise;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("app")
@Validated
public record AppProperties(
        @NotBlank String name,
        @Min(1) int maxItems
) {
}