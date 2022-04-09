package com.halal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@NamedQuery(name = SmartphoneEntity.QUERY_GET_ALL, query = "SELECT e FROM SmartphoneEntity e")
@DiscriminatorValue("smartphone")
public class SmartphoneEntity extends ProductEntity {
    public static final String QUERY_GET_ALL = "SmartphoneEntity.getAll";

    @Column(columnDefinition = "TEXT")
    private String manufacturer;

    public SmartphoneEntity(long id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

}
