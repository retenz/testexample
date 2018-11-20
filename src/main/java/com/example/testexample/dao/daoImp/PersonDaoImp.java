/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testexample.dao.daoImp;

import com.example.testexample.RowMapper.PersonRowMapper;
import com.example.testexample.model.Person;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.example.testexample.dao.PersonDao;


@Component("PersonDaoImp")
public class PersonDaoImp implements PersonDao{

    private final PersonRowMapper rowMapper= new PersonRowMapper();
    
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    public PersonDaoImp(DataSource dataSource)
    {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    @Override
    public void insert(Person person) {
         String sql= "insert into order (id, name) values (?,?)";
            jdbcTemplate.update(sql, new Object[]{person.getId(), person.getName()});
    }

    @Override
    public List<Person> getAll() {
        String sql= "select * from App.Models";
        return jdbcTemplate.query(sql, rowMapper);
    }
    
}
