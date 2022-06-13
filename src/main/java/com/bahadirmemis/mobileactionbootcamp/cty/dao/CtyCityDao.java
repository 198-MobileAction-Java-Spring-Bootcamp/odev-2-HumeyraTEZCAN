package com.bahadirmemis.mobileactionbootcamp.cty.dao;

import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface CtyCityDao extends JpaRepository<CtyCity, Long> {
}
