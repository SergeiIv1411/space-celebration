package com.ivanov.spacecelebration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="categories")
public class Category extends BaseEntity {
    private String title;
    private String description;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category parent;
}
