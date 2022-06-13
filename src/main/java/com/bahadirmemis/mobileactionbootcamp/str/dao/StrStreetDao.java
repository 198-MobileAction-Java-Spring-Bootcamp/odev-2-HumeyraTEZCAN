package com.bahadirmemis.mobileactionbootcamp.str.dao;

import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import com.bahadirmemis.mobileactionbootcamp.str.entity.StrStreet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface StrStreetDao extends JpaRepository<StrStreet, Long> {
}
