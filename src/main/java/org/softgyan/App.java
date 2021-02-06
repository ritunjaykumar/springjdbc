package org.softgyan;

import org.softgyan.dao.StudentDao;
import org.softgyan.dao.StudentDaoImp;
import org.softgyan.entities.Student;
import org.softgyan.jdbcconfig.JDBConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 */
public class App {
    private static final String CONFIG_PATH = "file:src/main/resources/config.xml";
    private static final String CONFIG_PATH_1 = "classpath:config.xml";


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JDBConfig.class);

        StudentDaoImp studentDao = context.getBean("studentDao", StudentDaoImp.class);
        Student student = new Student(
                6626,
                "Rani",
                "Gaya"
        );

//        int insert = studentDao.insert(student);
//        System.out.println(insert);

//        int update = studentDao.change(student);
//        System.out.println(update);

        //delete operation
//        System.out.println(studentDao.delete(101));
//        System.out.println(studentDao.getStudent(46));
        System.out.println(studentDao.getAllStudentData());
    }

}



