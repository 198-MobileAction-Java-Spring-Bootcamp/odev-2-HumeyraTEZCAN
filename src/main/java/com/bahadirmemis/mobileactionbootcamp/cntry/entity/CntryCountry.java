package com.bahadirmemis.mobileactionbootcamp.cntry.entity;

import com.bahadirmemis.mobileactionbootcamp.cty.entity.CtyCity;
import com.bahadirmemis.mobileactionbootcamp.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "CNTRY_COUNTRY")
@Getter
@Setter
public class CntryCountry extends BaseEntity {

    @Id
    @SequenceGenerator(name = "Cntry_Country", sequenceName = "CNTRY_COUNTRY_ID_SEQ")
    @GeneratedValue(generator = "Address")
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CTY_CITY")
    private CtyCity ctyCity;/**/

    @Column(name = "COUNTRY_CODE", length = 30)
    private String countryCode;

    @Column(name = "NAME", length = 30)
    private String countryName;



}
