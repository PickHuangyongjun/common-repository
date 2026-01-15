package com.jun.junaiagent.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 书房信息VO类
 * 用于Tool工具返回书房数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyRoomVO {
    /**
     * 书房ID
     */
    private String id;
    
    /**
     * 书房名称
     */
    private String name;
    
    /**
     * 可预约时段
     */
    private List<String> availableTimeSlots;
    
    /**
     * 剩余名额
     */
    private Integer remainingQuota;
}