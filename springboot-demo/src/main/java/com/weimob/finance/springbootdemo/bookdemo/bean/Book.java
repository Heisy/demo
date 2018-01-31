package com.weimob.finance.springbootdemo.bookdemo.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_book")
@Data
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    private String reader;

    private String title;

    private Date createTime;
}
