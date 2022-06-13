package com.bahadirmemis.mobileactionbootcamp.dst.entity;

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
@Table(name = "DST_DISTRICT")
@Getter
@Setter
public class DstDistrict extends BaseEntity {

    @Id
    @SequenceGenerator(name = "DstDistrict", sequenceName = "DST_DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "DstDistrict")
    private Long id;

    @ManytoOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CTY_CITY")
    private CtyCity ctyCity;/**/


    @Column(name = "NAME", length = 30)
    private String districtName;



}
