package com.bahadirmemis.mobileactionbootcamp.dst.service.entityservice;

import com.bahadirmemis.mobileactionbootcamp.cty.dao.CtyCityDao;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import com.bahadirmemis.mobileactionbootcamp.dst.dao.DstDistrictDao;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class DstDistrictEntityService extends BaseEntityService<DstDistrict, DstDistrictDao> {

    public DstDistrictEntityService(DstDistrictDao dao) {
        super(dao);
    }
}
