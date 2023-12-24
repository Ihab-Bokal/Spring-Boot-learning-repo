package com.selflearning.hibernate_jpa.dao;

import com.selflearning.hibernate_jpa.Entity.Student;

public interface IStudentDao {
    void save(Student myStudent);
//    Student findById(Long id);
//    Student[] findAll();
//    Student findByLastName(String lastName);
//    void update(Student modifiedStudent, Long originalStudentId);
    // We will have to retrieve the student's Id be it in this function or somewhere else. It would be better
    // To encapsulate this treatment in the delete method
//    void delete(Student mystudent);
//    void deleteAll();
}
