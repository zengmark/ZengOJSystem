package com.oj.zengoj.judge;

import com.oj.zengoj.judge.strategy.DefaultJudgeStrategy;
import com.oj.zengoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.oj.zengoj.judge.strategy.JudgeContext;
import com.oj.zengoj.judge.strategy.JudgeStrategy;
import com.oj.zengoj.judge.codesandbox.model.JudgeInfo;
import com.oj.zengoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
