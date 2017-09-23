package com.ssmweb.videoAlarm.dao;


import com.ssmweb.videoAlarm.pojo.EpcpVideoAlarm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpcpVideoAlarmMapper {
    List<EpcpVideoAlarm> selectEpcpVideoAlarms();
}