package com.bahadirmemis.mobileactionbootcamp.ngh.entity;

import com.bahadirmemis.mobileactionbootcamp.gen.entity.BaseEntity;
import com.bahadirmemis.mobileactionbootcamp.str.entity.StrStreet;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "NGH_NEIGHBOURHOOD")
@Getter
@Setter
public class NghNeighbourhood extends BaseEntity {

    @Id
    @SequenceGenerator(name = "NghNeighbourhood", sequenceName = "NGH_NEIGHBOURHOOD_ID_SEQ")
    @GeneratedValue(generator = "NghNeighbourhood")
    private Long id;

    @ManytoOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STR_STREET")
    private StrStreet strStreet;/**/


    @Column(name = "NAME", length = 30)
    private String neighbourhoodName;



}
