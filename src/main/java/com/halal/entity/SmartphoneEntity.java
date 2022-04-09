package com.halal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@DiscriminatorValue("smartphone")
public class SmartphoneEntity extends ProductEntity {
    @Column(columnDefinition = "TEXT")
    private String manufacturer;

    public SmartphoneEntity(long id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

}
