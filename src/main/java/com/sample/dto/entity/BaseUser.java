package com.sample.dto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BaseUser {

    @Id
    private String id;
    @Size(max=30)
    private String firstName;
    @Size(max=30)
    private String lastName;
}
