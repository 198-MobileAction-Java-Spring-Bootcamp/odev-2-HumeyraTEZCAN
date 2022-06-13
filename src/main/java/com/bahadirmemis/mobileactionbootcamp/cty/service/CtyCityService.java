package com.bahadirmemis.mobileactionbootcamp.cty.service;

import com.bahadirmemis.mobileactionbootcamp.cntry.converter.CntryCountryMapper;
import com.bahadirmemis.mobileactionbootcamp.cntry.dto.CntryCountryDto;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.cty.converter.CtyCityMapper;
import com.bahadirmemis.mobileactionbootcamp.cty.converter.CtyCityMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCityDto;
import com.bahadirmemis.mobileactionbootcamp.cty.dto.CtyCitySaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import com.bahadirmemis.mobileactionbootcamp.cty.service.entityservice.CtyCityEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class CtyCityService {

    private final CtyCityEntityService ctyCityEntityService;
    private final CtyCityMapperAbstract ctyCityMapperAbstract;



    public CtyCityDto findById(Long id) {

        CtyCity ctyCity = ctyCityEntityService.findByIdWithControl(id);

        CtyCityDto ctyCityDto = CtyCityMapper.INSTANCE.convertToCtyCityDto(ctyCity);

        return ctyCityDto;
    }

    public CtyCityDto save(CtyCitySaveRequestDto ctyCitySaveRequestDto) {

        String plateNo = getPlateNo();

        CtyCity ctyCity = ctyCityMapperAbstract.convertToCtyCity(ctyCitySaveRequestDto);
        ctyCity.setPlateNo(plateNo);
        ctyCity = ctyCityEntityService.save(ctyCity);

        CtyCityDto ctyCityDto = CtyCityMapper.INSTANCE.convertToCtyCityDto(ctyCity);

        return ctyCityDto;
    }



    private String getPlateNo(){
        return "43";
    }
}
