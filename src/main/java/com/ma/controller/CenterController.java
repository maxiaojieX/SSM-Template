package com.ma.controller;

import com.ma.entity.Students;
import com.ma.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@Controller
public class CenterController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/hello")
    public String welcome(Integer id, Model model) {

        Students students = studentsService.findById(id);
        model.addAttribute("name",students.getName());
        model.addAttribute("email",students.getEmail());

        return "result";
    }

    @GetMapping("/test")
    public String hello(){
        System.out.println("come in......");
        return "result";
    }
}
