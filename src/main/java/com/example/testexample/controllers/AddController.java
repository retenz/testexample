package com.example.testexample.controllers;

import com.example.testexample.dao.daoImp.PersonDaoImp;
import com.example.testexample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AddController {
    
    @Autowired
    PersonDaoImp personDaoImp;
    
    @RequestMapping(value = "/add.form",method = RequestMethod.GET)
    public ModelAndView testGet(){
        personDaoImp.create();
        return new ModelAndView("add");    
    }
    
    @RequestMapping(value = "/add.form",method = RequestMethod.POST)
    public ModelAndView testPost(@RequestParam("id") Integer id, @RequestParam("name") String name, Model model){
        personDaoImp.insert(new Person(id, name));
          
        return new ModelAndView("add");
    }
}
//return "add";