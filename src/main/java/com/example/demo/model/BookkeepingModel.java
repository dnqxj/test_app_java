package com.example.demo.model;

import com.llqqww.thinkjdbc.Column;
import com.llqqww.thinkjdbc.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "t_bookkeeping")
public class BookkeepingModel {
    @Column(isKey = true)
    private Long id;
    private Long uid;
    private String name;
    private Double income;
    private Double expenditure;
    private String date;
    @Column(name = "create_time")
    private Long createTime;
    @Column(name = "update_time")
    private Long updateTime;
}