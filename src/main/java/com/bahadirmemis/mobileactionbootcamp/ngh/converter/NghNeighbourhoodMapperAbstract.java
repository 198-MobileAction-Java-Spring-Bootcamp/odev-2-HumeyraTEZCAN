package com.bahadirmemis.mobileactionbootcamp.ngh.converter;

import com.bahadirmemis.mobileactionbootcamp.cty.service.entityservice.CtyCityEntityService;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.dst.service.entityservice.DstDistrictEntityService;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class NghNeighbourhoodMapperAbstract {

    @Autowired
    DstDistrictEntityService dstDistrictEntityService;
//burası değişecek
    @Mapping(
            target = "strStreet",
            expression="java(strStreetEntityService.findByIdWithControl(strStreetSaveRequestDto.getStrStreetId()))"
    )
    public abstract NghNeighbourhood convertToNghNeighbourhood(NghNeighbourhoodSaveRequestDto nghNeighbourhoodSaveRequestDto);
}
