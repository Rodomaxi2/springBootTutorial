package com.fundamentosPlatzi.springboot.fundamentos.controller;

import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextController {

    private MyBeanWithDependency myBeanWithDependency;
    @Autowired
    public TextController(MyBeanWithDependency myBeanWithDependency){
        this.myBeanWithDependency = myBeanWithDependency;
    }
    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> function(){
        return new ResponseEntity<>(myBeanWithDependency.printWhithDependency(), HttpStatus.OK);
    }
}
