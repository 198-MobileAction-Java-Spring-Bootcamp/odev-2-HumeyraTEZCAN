package com.bahadirmemis.mobileactionbootcamp.str.converter;

import com.bahadirmemis.mobileactionbootcamp.dst.service.entityservice.DstDistrictEntityService;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import com.bahadirmemis.mobileactionbootcamp.ngh.service.entityservice.NghNeighbourhoodEntityService;
import com.bahadirmemis.mobileactionbootcamp.str.dto.StrStreetSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.str.entity.StrStreet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public abstract class StrStreetMapperAbstract {

    @Autowired
    NghNeighbourhoodEntityService nghNeighbourhoodEntityService;
//burası değişecek
    @Mapping(
            target = "nghNeighbourhood",
            expression="java(nghNeighbourhoodEntityService.findByIdWithControl(nghNeighbourhoodSaveRequestDto.getNghNeighbourhoodId()))"
    )
    public abstract StrStreet convertToStrStreet(StrStreetSaveRequestDto strStreetSaveRequestDto);
}
