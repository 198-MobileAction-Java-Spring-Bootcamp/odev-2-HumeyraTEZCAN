package com.bahadirmemis.mobileactionbootcamp.dst.converter;


import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictDto;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DstDistrictMapper {

    DstDistrictMapper INSTANCE = Mappers.getMapper(DstDistrictMapper.class);

    @Mapping(source = "ctyCity.id", target = "ctyCityId")
    DstDistrictDto convertToDstDistrictDto(DstDistrict dstDistrict);


}
