package com.nlb.task.controller;

import com.nlb.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/hello")
    @ResponseBody
    public String test01() throws InterruptedException {
        taskService.task();
        return "wanshi";
    }


}
