package com.kodlamaio.commonpackage.utils.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarInfoResponse
{
    private String modelName;
    private String brandName;
    private String plate;
    private int modelYear;
}