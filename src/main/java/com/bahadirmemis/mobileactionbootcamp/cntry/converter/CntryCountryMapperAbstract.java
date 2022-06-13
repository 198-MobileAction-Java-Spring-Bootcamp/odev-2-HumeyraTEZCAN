package com.bahadirmemis.mobileactionbootcamp.cntry.converter;

import com.bahadirmemis.mobileactionbootcamp.cntry.dto.CntryCountrySaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class CntryCountryMapperAbstract {

    public abstract CntryCountry convertToCntryCountry(CntryCountrySaveRequestDto cntryCountrySaveRequestDto);
}
