package com.codegym.fs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String code;

    @NotNull
    private String name;

    private String avatar = "https://www.chanchao.com.tw/VietnamWood/images/default.jpg";

    @Min(0)
    @Max(100)
    @NotNull
    private int discount;

    @NotNull
    @Min(0)
    private long price;

    @Column(columnDefinition = "longtext")
    private String description;

    private boolean status;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Brand brand;

}
