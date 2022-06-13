package com.bahadirmemis.mobileactionbootcamp.ngh.converter;


import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictDto;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NghNeighbourhoodMapper {

    NghNeighbourhoodMapper INSTANCE = Mappers.getMapper(NghNeighbourhoodMapper.class);

    @Mapping(source = "strStreet.id", target = "strStreetId")
    NghNeighbourhoodDto convertToNghNeighbourhoodDto(NghNeighbourhood nghNeighbourhood);


}
