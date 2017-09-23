package com.ssmweb.videoAlarm.action;

import com.ssmweb.videoAlarm.service.EpcpVideoAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EpcpVideoAlarmAction {
    @Autowired
    private EpcpVideoAlarmService videoAlarmService;

    public String selectEpcpVideoAlarms() {
        System.out.println("selectEpcpVideoAlarms" + "++++++++++++++");
        videoAlarmService.selectEpcpVideoAlarms();
        return "SUCCESS";
    }
}
