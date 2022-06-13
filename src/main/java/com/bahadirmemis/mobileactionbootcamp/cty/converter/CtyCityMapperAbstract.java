package com.bahadirmemis.mobileactionbootcamp.cty.converter;

import com.bahadirmemis.mobileactionbootcamp.cntry.service.entityservice.CntryCountryEntityService;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCitySaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class CtyCityMapperAbstract {

    @Autowired
    CntryCountryEntityService cntryCountryEntityService;

    @Mapping(
            target = "cntryCountry",
            expression="java(cntryCountryEntityService.findByIdWithControl(cntryCountrySaveRequestDto.getCntryCountryId()))"
    )
    public abstract CtyCity convertToCtyCity(CtyCitySaveRequestDto ctyCitySaveRequestDto);
}
