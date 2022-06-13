package com.bahadirmemis.mobileactionbootcamp.str.converter;


import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import com.bahadirmemis.mobileactionbootcamp.str.dto.StrStreetDto;
import com.bahadirmemis.mobileactionbootcamp.str.entity.StrStreet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StrStreetMapper {

    StrStreetMapper INSTANCE = Mappers.getMapper(StrStreetMapper.class);

    @Mapping(source = "nghNeighbourhood.id", target = "nghNeighbourhoodId")
    StrStreetDto convertToStrStreetDto(StrStreet strStreet);


}
