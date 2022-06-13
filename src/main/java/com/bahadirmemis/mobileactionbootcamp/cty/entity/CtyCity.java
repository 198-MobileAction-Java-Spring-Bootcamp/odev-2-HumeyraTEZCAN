package com.bahadirmemis.mobileactionbootcamp.cty.entity;

import com.bahadirmemis.mobileactionbootcamp.cntry.entity.CntryCountry;
import com.bahadirmemis.mobileactionbootcamp.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "CTY_CITY")
@Getter
@Setter
public class CtyCity extends BaseEntity {

    @Id
    @SequenceGenerator(name = "StrStreet", sequenceName = "CTY_CITY_ID_SEQ")
    @GeneratedValue(generator = "StrStreet")
    private Long id;

    @ManytoOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CNTRY_COUNTRY")
    private CntryCountry cntryCountry;/**/

    @Column(name = "PLATE_NO", length = 30)
    private String plateNo;

    @Column(name = "NAME", length = 30)
    private String cityName;



}
