package com.example.testexample.controllers;

import com.example.testexample.dao.daoImp.PersonDaoImp;
import com.example.testexample.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {
    
    @Autowired
    PersonDaoImp personDaoImp;
    
    @RequestMapping(value = "/list.form",method = RequestMethod.GET)
    public ModelAndView testGET(){
    return new ModelAndView("list");
    }
    
    @RequestMapping(value = "/list.form",method = RequestMethod.POST)
    public ModelAndView testPOST(Model model){
        personDaoImp.create();
        List<Person> persons= personDaoImp.getAll();
        return new ModelAndView("list", "persons", persons);
    }
    
}
