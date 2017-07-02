package com.sample.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@ToString(exclude = "")
public class BaseUserAccount {

    @Id
    private String id;
    @JsonIgnore
    private String password;
}
