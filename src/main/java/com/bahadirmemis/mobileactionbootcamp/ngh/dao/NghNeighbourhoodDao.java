package com.bahadirmemis.mobileactionbootcamp.ngh.dao;

import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface NghNeighbourhoodDao extends JpaRepository<NghNeighbourhood, Long> {
}
