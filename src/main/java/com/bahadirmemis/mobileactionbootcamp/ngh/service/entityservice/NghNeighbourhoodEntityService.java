package com.bahadirmemis.mobileactionbootcamp.ngh.service.entityservice;

import com.bahadirmemis.mobileactionbootcamp.dst.dao.DstDistrictDao;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.gen.service.BaseEntityService;
import com.bahadirmemis.mobileactionbootcamp.ngh.dao.NghNeighbourhoodDao;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class NghNeighbourhoodEntityService extends BaseEntityService<NghNeighbourhood, NghNeighbourhoodDao> {

    public NghNeighbourhoodEntityService(NghNeighbourhoodDao dao) {
        super(dao);
    }
}
