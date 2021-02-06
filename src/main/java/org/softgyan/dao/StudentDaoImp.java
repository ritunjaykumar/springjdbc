package org.softgyan.dao;

import org.softgyan.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImp implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into Student(id, student, city) values(?,?,?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getStudent(), student.getCity());

    }

    @Override
    public int change(Student student) {
//        update query
        String query = "update student set student=?, city =? where id = ?";
        return this.jdbcTemplate.update(query, student.getStudent(), student.getCity(), student.getId());
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        return  this.jdbcTemplate.update(query, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        //select single query
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImp();
        Student student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudentData() {
        //select multiple students
        String query = "select *from student";
        List<Student> query1 = jdbcTemplate.query(query, new RowMapperImp());
        return query1;
    }
}
