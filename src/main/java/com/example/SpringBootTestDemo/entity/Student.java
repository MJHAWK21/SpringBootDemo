package com.example.SpringBootTestDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name="Id")
    private Integer id;
    @NotBlank
    @Column(name="NAME")
    private String name;
    @NotBlank
    @Column(name="ADDRESS")
    private String address;
    @NotBlank
    @Column(name="ROLLNO")
    private String rollNo;

}
