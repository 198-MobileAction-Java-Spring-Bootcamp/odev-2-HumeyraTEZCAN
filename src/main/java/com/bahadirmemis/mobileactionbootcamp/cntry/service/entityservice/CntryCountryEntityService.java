package com.bahadirmemis.mobileactionbootcamp.cntry.service.entityservice;

import com.bahadirmemis.mobileactionbootcamp.cntry.dao.CntryCountryDao;
import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class CntryCountryEntityService extends BaseEntityService<CntryCountry, CntryCountryDao> {

    public CntryCountryEntityService(CntryCountryDao dao) {
        super(dao);
    }
}
