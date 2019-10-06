package com.nlb.task.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

public class test01 {
    @Scheduled(cron = "* * * * * *")
    public void test01(){
        System.out.println("处理");
    }
}
