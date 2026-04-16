package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;


@Entity
@Data
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole Role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;



}
