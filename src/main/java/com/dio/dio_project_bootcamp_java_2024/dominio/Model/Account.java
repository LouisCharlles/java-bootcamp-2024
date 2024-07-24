package com.dio.dio_project_bootcamp_java_2024.dominio.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13,scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 2,scale = 13)
    private BigDecimal limit;
}
