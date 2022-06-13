package com.bahadirmemis.mobileactionbootcamp.str.service;

import com.bahadirmemis.mobileactionbootcamp.ngh.converter.NghNeighbourhoodMapper;
import com.bahadirmemis.mobileactionbootcamp.ngh.converter.NghNeighbourhoodMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.dto.NghNeighbourhoodSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import com.bahadirmemis.mobileactionbootcamp.ngh.service.entityservice.NghNeighbourhoodEntityService;
import com.bahadirmemis.mobileactionbootcamp.str.converter.StrStreetMapper;
import com.bahadirmemis.mobileactionbootcamp.str.converter.StrStreetMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.str.dto.StrStreetDto;
import com.bahadirmemis.mobileactionbootcamp.str.dto.StrStreetSaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.str.entity.StrStreet;
import com.bahadirmemis.mobileactionbootcamp.str.service.entityservice.StrStreetEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class StrStreetService {

    private final StrStreetEntityService strStreetEntityService;
    private final StrStreetMapperAbstract strStreetMapperAbstract;


    public StrStreetDto findById(Long id) {

        StrStreet strStreet = strStreetEntityService.findByIdWithControl(id);

        StrStreetDto strStreetDto = StrStreetMapper.INSTANCE.convertToStrStreetDto(strStreet);

        return strStreetDto;
    }

    public StrStreetDto save(StrStreetSaveRequestDto strStreetSaveRequestDto) {


        StrStreet strStreet = strStreetMapperAbstract.convertToStrStreet(strStreetSaveRequestDto);

        strStreet = strStreetEntityService.save(strStreet);

        StrStreetDto strStreetDto = StrStreetMapper.INSTANCE.convertToStrStreetDto(strStreet);

        return strStreetDto;
    }
}

