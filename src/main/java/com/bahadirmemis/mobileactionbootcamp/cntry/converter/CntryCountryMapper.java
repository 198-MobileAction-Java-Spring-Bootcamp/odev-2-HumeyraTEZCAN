package com.bahadirmemis.mobileactionbootcamp.cntry.converter;

import com.bahadirmemis.mobileactionbootcamp.cntry.dto.CntryCountryDto;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
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
public interface CntryCountryMapper {

    CntryCountryMapper INSTANCE = Mappers.getMapper(CntryCountryMapper.class);

    @Mapping(source = "ctyCity.id", target = "ctyCityId")
    CntryCountryDto convertToCntryCountryDto(CntryCountry cntryCountry);

    List<CntryCountryDto> convertToCntryCountryDtoList(List<CntryCountry> cntryCountryList);

}
