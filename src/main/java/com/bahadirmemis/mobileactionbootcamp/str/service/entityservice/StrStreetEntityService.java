package com.bahadirmemis.mobileactionbootcamp.str.service.entityservice;

import com.bahadirmemis.mobileactionbootcamp.gen.service.BaseEntityService;
import com.bahadirmemis.mobileactionbootcamp.ngh.dao.NghNeighbourhoodDao;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import com.bahadirmemis.mobileactionbootcamp.str.dao.StrStreetDao;
import com.bahadirmemis.mobileactionbootcamp.str.entity.StrStreet;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class StrStreetEntityService extends BaseEntityService<StrStreet, StrStreetDao> {

    public StrStreetEntityService(StrStreetDao dao) {
        super(dao);
    }
}
