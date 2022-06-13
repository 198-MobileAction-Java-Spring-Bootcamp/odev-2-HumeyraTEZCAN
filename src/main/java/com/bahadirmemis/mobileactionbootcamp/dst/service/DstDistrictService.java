package com.bahadirmemis.mobileactionbootcamp.dst.service;

import com.bahadirmemis.mobileactionbootcamp.dst.converter.DstDistrictMapper;
import com.bahadirmemis.mobileactionbootcamp.dst.converter.DstDistrictMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictDto;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.dst.service.entityservice.DstDistrictEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class DstDistrictService {

    private final DstDistrictEntityService dstDistrictEntityService;
    private final DstDistrictMapperAbstract dstDistrictMapperAbstract;


    public DstDistrictDto findById(Long id) {

        DstDistrict dstDistrict = dstDistrictEntityService.findByIdWithControl(id);

        DstDistrictDto dstDistrictDto = DstDistrictMapper.INSTANCE.convertToDstDistrictDto(dstDistrict);

        return dstDistrictDto;
    }

    public DstDistrictDto save(DstDistrictSaveRequestDto dstDistrictSaveRequestDto) {


        DstDistrict dstDistrict = dstDistrictMapperAbstract.convertToDstDistrict(dstDistrictSaveRequestDto);

        dstDistrict = dstDistrictEntityService.save(dstDistrict);

        DstDistrictDto dstDistrictDto = DstDistrictMapper.INSTANCE.convertToDstDistrictDto(dstDistrict);

        return dstDistrictDto;
    }
}

