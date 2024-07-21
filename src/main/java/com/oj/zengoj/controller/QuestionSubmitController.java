package com.oj.zengoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oj.zengoj.common.BaseResponse;
import com.oj.zengoj.common.ErrorCode;
import com.oj.zengoj.common.ResultUtils;
import com.oj.zengoj.exception.BusinessException;
import com.oj.zengoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.oj.zengoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.oj.zengoj.model.entity.Question;
import com.oj.zengoj.model.entity.QuestionSubmit;
import com.oj.zengoj.model.entity.User;
import com.oj.zengoj.model.vo.QuestionSubmitVO;
import com.oj.zengoj.service.QuestionSubmitService;
import com.oj.zengoj.service.UserService;
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
