package com.example.systemdb;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "composite_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CompositeKey.class)
public class Test {

    @Id
    private int id;
    @Id
    private int deptId;
    @Id
    private String name;

    private String mobileNo;

    private String city;

}
