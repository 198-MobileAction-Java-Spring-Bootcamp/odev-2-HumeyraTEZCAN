package com.bahadirmemis.mobileactionbootcamp.cntry.dto;

import lombok.Data;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Data
public class CntryCountryDto {

    private Long id;
    private Long ctyCityId;
    private String countryCode;
    private String countryName;
}
