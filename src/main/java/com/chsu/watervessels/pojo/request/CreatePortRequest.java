package com.chsu.watervessels.pojo.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreatePortRequest {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 100)
    private String portName;

    @NotNull
    @NotBlank
    private String countryName;
}
