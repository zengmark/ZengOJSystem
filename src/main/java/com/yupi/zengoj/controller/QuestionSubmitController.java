package com.yupi.zengoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.zengoj.common.BaseResponse;
import com.yupi.zengoj.common.ErrorCode;
import com.yupi.zengoj.common.ResultUtils;
import com.yupi.zengoj.exception.BusinessException;
import com.yupi.zengoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.zengoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.zengoj.model.entity.Question;
import com.yupi.zengoj.model.entity.QuestionSubmit;
import com.yupi.zengoj.model.entity.User;
import com.yupi.zengoj.model.vo.QuestionSubmitVO;
import com.yupi.zengoj.service.QuestionSubmitService;
import com.yupi.zengoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
//@RequestMapping("/question_submit")
@Slf4j
@Deprecated
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

//    /**
//     * 点赞 / 取消点赞
//     *
//     * @param questionSubmitAddRequest
//     * @param request
//     * @return 提交记录的 id，可以通过这个 id 去查询题目当前的状态
//     */
//    @PostMapping("/")
//    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
//                                               HttpServletRequest request) {
//        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        // 登录才能点赞
//        final User loginUser = userService.getLoginUser(request);
//        long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
//        return ResultUtils.success(questionSubmitId);
//    }
//
//    /**
//     * 分页获取题目提交列表（除了管理员外，普通用户只能看到非答案、提交代码等公开信息）
//     *
//     * @param questionSubmitQueryRequest
//     * @param request
//     * @return 提交记录的 id，可以通过这个 id 去查询题目当前的状态
//     */
//    @PostMapping("/list/page")
//    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest,
//                                                                         HttpServletRequest request) {
//        long current = questionSubmitQueryRequest.getCurrent();
//        long size = questionSubmitQueryRequest.getPageSize();
//        // 从数据库中查询原始的题目提交分页信息
//        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
//                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
//        // 返回脱敏信息
//        final User loginUser = userService.getLoginUser(request);
//        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage, loginUser));
//    }

}
