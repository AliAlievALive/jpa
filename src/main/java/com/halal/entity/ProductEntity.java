package com.halal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@MappedSuperclass
@DiscriminatorColumn(name = "product_type")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // для каждой дочерней сущности свои таблицы
//@Inheritance(strategy = InheritanceType.JOINED) // для каждой родительской и дочерней сущности свои таблицы
                                                  // у дочерней foreign keys ссылается на родительскую таблицу
// По умолчанию создается общая родительская таблица со всеми полями дочерних классов
public class ProductEntity { // Можно делать абстрактным классом
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String name;
    private int price;
}
