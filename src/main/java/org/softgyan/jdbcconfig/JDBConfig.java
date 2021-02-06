package org.softgyan.jdbcconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * configure spring database using java class
 */

@Configuration("jdbcConfig")
@ComponentScan(basePackages = {"org.softgyan.dao"}) //auto wire added file
public class JDBConfig {
    @Bean("ds")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/springjdbc?autoReconnect=true&useSSL=false");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean("template")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    /*
        temporary getStudentDao is commented because, i am going to use auto wiring
        for auto wiring i comment as auto wire for under standing
     */


//    @Bean("studentDao")
//    public StudentDao getStudentDao(){
//        StudentDaoImp studentDao = new StudentDaoImp();
//        studentDao.setJdbcTemplate(getTemplate());
//        return studentDao;
//    }
}
