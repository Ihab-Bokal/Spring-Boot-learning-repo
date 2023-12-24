package com.selflearning.hibernate_jpa;

import com.selflearning.hibernate_jpa.Entity.Student;
import com.selflearning.hibernate_jpa.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    @Autowired
    // To inject the StudentDao object in the CLI runner
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        // Spring will run this method once all the beans are initialized
        return runner -> {
            registerStudent(studentDao);
        };
    }

    private void registerStudent(StudentDao studentDao) {
        // create the student
        System.out.println("Creating the student");
        Student mystud = new Student("Ihab", "Bokal", "bokalihab@gmail.com");

        // registering student
        System.out.println("Registering the student");
        studentDao.save(mystud);

        // The student must be saved in the db
        System.out.println("Saved the student. Generated Id: " + mystud.getId());
    }
}
