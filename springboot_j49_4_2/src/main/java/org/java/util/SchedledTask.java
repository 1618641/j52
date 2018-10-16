package org.java.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component//标识
public class SchedledTask {
    //配置调度的规则
    @Scheduled(cron = "1,5,12 * * * * ?")
    public void first(){

        System.out.println("正在执行任务");
    }

}
