package com.example.testexample.controllers;

import com.example.testexample.dao.daoImp.PersonDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {
    
    @Autowired
    PersonDaoImp personDaoImp;
    
    @RequestMapping(value = "/list.form",method = RequestMethod.GET)
    public String testGET(){
    return "list";
    }
    
    @RequestMapping(value = "/list.form",method = RequestMethod.POST)
    public String testPOST(Model model){
    model.addAttribute(personDaoImp.getAll());
    return "list";
    }
    
}
