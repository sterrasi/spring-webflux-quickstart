package com.github.sterrasi.webflux.starter.controllers.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record Teacher(long id,
                      @NotBlank
                      String firstName,
                      String middleName,
                      @NotBlank
                      String lastName
) {

}
