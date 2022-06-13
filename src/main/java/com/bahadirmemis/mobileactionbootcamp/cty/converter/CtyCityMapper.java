package com.bahadirmemis.mobileactionbootcamp.cty.converter;

import com.bahadirmemis.mobileactionbootcamp.cntry.dto.CntryCountryDto;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCityDto;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CtyCityMapper {

    CtyCityMapper INSTANCE = Mappers.getMapper(CtyCityMapper.class);

    @Mapping(source = "cntryCountry.id", target = "cntryCountryId")
    CtyCityDto convertToCtyCityDto(CtyCity ctyCity);


}
