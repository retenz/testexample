/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testexample.dao.daoImp;

import com.example.testexample.RowMapper.PersonRowMapper;
import com.example.testexample.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.example.testexample.dao.PersonDao;
import javax.sql.DataSource;

@Component("PersonDaoImp")
public class PersonDaoImp implements PersonDao{

    private final PersonRowMapper rowMapper= new PersonRowMapper();
    
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    public void setDataSource(DataSource dataSource)
    {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public void insert(Person person) {
        
         String sql= "insert into Test (id, name) values (?,?)";
            jdbcTemplate.update(sql, new Object[]{person.getId(), person.getName()});
    }

    @Override
    public List<Person> getAll() {
        String sql= "select * from Test";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create() {
        String sql= "CREATE table if not exist test (Id INT NOT NULL, Name VARCHAR(100) NOT NULL, PRIMARY KEY(Id))";
        jdbcTemplate.execute(sql);
    }
}
