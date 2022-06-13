package com.bahadirmemis.mobileactionbootcamp.ngh.service;

import com.bahadirmemis.mobileactionbootcamp.dst.converter.DstDistrictMapper;
import com.bahadirmemis.mobileactionbootcamp.dst.converter.DstDistrictMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictDto;
import com.bahadirmemis.mobileactionbootcamp.dst.dto.DstDistrictSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.dst.service.entityservice.DstDistrictEntityService;
import com.bahadirmemis.mobileactionbootcamp.ngh.converter.NghNeighbourhoodMapper;
import com.bahadirmemis.mobileactionbootcamp.ngh.converter.NghNeighbourhoodMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import com.bahadirmemis.mobileactionbootcamp.ngh.service.entityservice.NghNeighbourhoodEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class NghNeighbourhoodService {

    private final NghNeighbourhoodEntityService nghNeighbourhoodEntityService;
    private final NghNeighbourhoodMapperAbstract nghNeighbourhoodMapperAbstract;


    public NghNeighbourhoodDto findById(Long id) {

        NghNeighbourhood nghNeighbourhood = nghNeighbourhoodEntityService.findByIdWithControl(id);

        NghNeighbourhoodDto nghNeighbourhoodDto = NghNeighbourhoodMapper.INSTANCE.convertToNghNeighbourhoodDto(nghNeighbourhood);

        return nghNeighbourhoodDto;
    }

    public NghNeighbourhoodDto save(NghNeighbourhoodSaveRequestDto nghNeighbourhoodSaveRequestDto) {


        NghNeighbourhood nghNeighbourhood = nghNeighbourhoodMapperAbstract.convertToNghNeighbourhood(nghNeighbourhoodSaveRequestDto);

        nghNeighbourhood = nghNeighbourhoodEntityService.save(nghNeighbourhood);

        NghNeighbourhoodDto nghNeighbourhoodDto = NghNeighbourhoodMapper.INSTANCE.convertToNghNeighbourhoodDto(nghNeighbourhood);

        return nghNeighbourhoodDto;
    }
}

