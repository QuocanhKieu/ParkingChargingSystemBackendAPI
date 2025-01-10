package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode
@Table(name = "[User]") // SQL Server will recognize the square brackets
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private Double salary;

    // No need for explicit getters, setters, constructors, or toString method anymore
}
