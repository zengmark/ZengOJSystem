package com.yupi.zengoj.judge.codesandbox.impl;

import com.yupi.zengoj.judge.codesandbox.CodeSandbox;
import com.yupi.zengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.zengoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.zengoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.zengoj.model.enums.JudgeInfoMessageEnum;
import com.yupi.zengoj.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱（仅为了跑通业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCESS.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
