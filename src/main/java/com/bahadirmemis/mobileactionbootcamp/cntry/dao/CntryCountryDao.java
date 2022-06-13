package com.bahadirmemis.mobileactionbootcamp.cntry.dao;

import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface CntryCountryDao extends JpaRepository<CntryCountry, Long> {
}
