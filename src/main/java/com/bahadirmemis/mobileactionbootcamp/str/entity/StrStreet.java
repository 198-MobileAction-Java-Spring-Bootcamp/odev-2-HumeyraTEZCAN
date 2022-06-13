package com.bahadirmemis.mobileactionbootcamp.str.entity;

import com.bahadirmemis.mobileactionbootcamp.gen.entity.BaseEntity;
import com.bahadirmemis.mobileactionbootcamp.ngh.entity.NghNeighbourhood;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "STR_STREET")
@Getter
@Setter
public class StrStreet extends BaseEntity {

    @Id
    @SequenceGenerator(name = "StrStreet", sequenceName = "STR_STREET_ID_SEQ")
    @GeneratedValue(generator = "StrStreet")
    private Long id;

    @ManytoOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_NGH_NEIGHBOURHOOD")
    private NghNeighbourhood nghNeighbourhood;//***/


    @Column(name = "NAME", length = 30)
    private String streetName;



}
