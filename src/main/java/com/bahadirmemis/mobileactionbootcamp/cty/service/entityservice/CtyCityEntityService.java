package com.bahadirmemis.mobileactionbootcamp.cty.service.entityservice;

import com.bahadirmemis.mobileactionbootcamp.cntry.dao.CntryCountryDao;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.cty.dao.CtyCityDao;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import com.bahadirmemis.mobileactionbootcamp.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class CtyCityEntityService extends BaseEntityService<CtyCity, CtyCityDao> {

    public CtyCityEntityService(CtyCityDao dao) {
        super(dao);
    }
}
