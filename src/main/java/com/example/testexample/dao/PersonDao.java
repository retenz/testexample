package com.example.testexample.dao;

import com.example.testexample.model.Person;
import java.util.List;

public interface PersonDao {
    void insert(Person model);
    List<Person> getAll();
}
