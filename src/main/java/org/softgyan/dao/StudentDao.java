package org.softgyan.dao;

import org.softgyan.entities.Student;

import java.util.List;

/**
 * it is just interface
 */
public interface StudentDao {
    int insert(Student student);
    int change(Student student);
    int delete(int studentId);
    Student getStudent(int studentId);
    List<Student> getAllStudentData();
}
