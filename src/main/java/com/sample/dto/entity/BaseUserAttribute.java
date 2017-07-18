package com.sample.dto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BaseUserAttribute implements Serializable {

    @Id
    private String attributeName;
    @Column
    private int sortNo;
    @Column
    private String id;
}
