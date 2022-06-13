package com.bahadirmemis.mobileactionbootcamp.dst.dao;

import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import com.bahadirmemis.mobileactionbootcamp.dst.entity.DstDistrict;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface DstDistrictDao extends JpaRepository<DstDistrict, Long> {
}
