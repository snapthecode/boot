package com.pdc.boot.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "board")
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bno;
    private String title;
    private String writer;
    private String content;

}