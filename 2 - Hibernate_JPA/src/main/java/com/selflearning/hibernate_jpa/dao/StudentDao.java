package com.selflearning.hibernate_jpa.dao;

import com.selflearning.hibernate_jpa.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
// This annotation is specific for dao objects. It translates JDBC exceptions + Supports component scanning
public class StudentDao implements IStudentDao {
    @PersistenceContext // This annotation replaces injecting this field into the constructor using Autowired
    private EntityManager entityManager;


    @Override
    @Transactional
    // This annotation will automatically manage the transactions with the db
    // The connection will be created and terminated automatically without having us write boilerplate code
    public void save(Student myStudent) {
        entityManager.persist(myStudent);
    }
}
