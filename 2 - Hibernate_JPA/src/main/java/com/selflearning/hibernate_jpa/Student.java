package com.selflearning.hibernate_jpa;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    // This id is going to be generated and tracked by the db. No need for us to do any treatment on our end
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
