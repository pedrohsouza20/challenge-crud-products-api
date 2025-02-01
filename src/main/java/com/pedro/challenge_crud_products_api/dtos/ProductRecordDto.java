package com.pedro.challenge_crud_products_api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotBlank String description, @NotNull BigDecimal price, @NotNull Boolean available) {
}