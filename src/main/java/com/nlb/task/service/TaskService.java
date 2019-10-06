package com.nlb.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Async
    public void task() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("处理");
    }
}
