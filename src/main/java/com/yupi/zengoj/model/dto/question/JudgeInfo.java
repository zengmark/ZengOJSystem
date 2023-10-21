package com.yupi.zengoj.model.dto.question;

import lombok.Data;

import java.nio.ByteBuffer;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存（KB）
     */
    private Long memory;

    /**
     * 消耗时间
     */
    private Long time;

}
