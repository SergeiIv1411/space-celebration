package com.ivanov.spacecelebration.model;

import lombok.Getter;

import javax.persistence.*;

@MappedSuperclass
@Getter
public class BaseEntity {
    private static final String SEQ_NAME = "order_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;
}
