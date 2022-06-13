package com.bahadirmemis.mobileactionbootcamp.dst.converter;

import com.bahadirmemis.mobileactionbootcamp.cntry.service.entityservice.CntryCountryEntityService;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCitySaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import com.bahadirmemis.mobileactionbootcamp.cty.service.entityservice.CtyCityEntityService;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class DstDistrictMapperAbstract {

    @Autowired
    CtyCityEntityService ctyCityEntityService;
//burası değişecek
    @Mapping(
            target = "ctyCity",
            expression="java(ctyCityEntityService.findByIdWithControl(ctyCitySaveRequestDto.getCtyCityId()))"
    )
    public abstract DstDistrict convertToDstDistrict(DstDistrictSaveRequestDto dstDistrictSaveRequestDto);
}
