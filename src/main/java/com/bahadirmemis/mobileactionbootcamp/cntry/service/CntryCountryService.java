package com.bahadirmemis.mobileactionbootcamp.cntry.service;

import com.bahadirmemis.mobileactionbootcamp.cntry.converter.CntryCountryMapper;
import com.bahadirmemis.mobileactionbootcamp.cntry.converter.CntryCountryMapperAbstract;
import com.bahadirmemis.mobileactionbootcamp.cntry.dto.CntryCountrySaveRequestDto;
import com.bahadirmemis.mobileactionbootcamp.cntry.dto.CntryCountryDto;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.cntry.service.entityservice.CntryCountryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class CntryCountryService {

    private final CntryCountryEntityService cntryCountryEntityService;
    private final CntryCountryMapperAbstract cntryCountryMapperAbstract;



    public CntryCountryDto findById(Long id) {

        CntryCountry cntryCountry = cntryCountryEntityService.findByIdWithControl(id);

        CntryCountryDto cntryCountryDto = CntryCountryMapper.INSTANCE.convertToCntryCountryDto(cntryCountry);

        return cntryCountryDto;
    }

    public CntryCountryDto save(CntryCountrySaveRequestDto cntryCountrySaveRequestDto) {

        String countryCode = getCountryCode();

        CntryCountry cntryCountry = cntryCountryMapperAbstract.convertToCntryCountry(cntryCountrySaveRequestDto);
        cntryCountry.setCountryCode(countryCode);
        cntryCountry = cntryCountryEntityService.save(cntryCountry);

        CntryCountryDto accAccountDto = CntryCountryMapper.INSTANCE.convertToCntryCountryDto(cntryCountry);

        return accAccountDto;
    }



    private String getCountryCode(){
        return "+90";
    }
}
