package com.jun.junaiagent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AI智能助手控制器
 * 处理前端请求，调用服务层处理用户消息
 */
@RestController
@RequestMapping("/ai")
public class AiController {

    /**
     * 处理用户消息
     * @return AI助手的响应结果
     */
    @PostMapping("/chat")
    public ResponseEntity<String> processUserMessage() {

        return ResponseEntity.ok("");
    }

    /**
     * 清理用户对话历史
     * @param userId 用户ID
     * @return 清理结果
     */
    @PostMapping("/clear/{userId}")
    public ResponseEntity<String> clearUserConversation(@PathVariable String userId) {
        return ResponseEntity.ok("对话历史已清理");
    }
}
