package com.dongnaoedu.service.problem;

import com.dongnaoedu.aim.ProblemBank;

/**
 * 动脑学院-Mark老师
 * 创建日期：2017/12/04
 * 创建时间: 22:13
 *
 */
public class ProblemService {

    /**
     * 普通对题目进行处理
     * @param problemId 题目id
     * @return 题目解析后的文本
     */
    public static String makeProblem(Integer problemId){
        return BaseProblemService.makeProblem(problemId,
                ProblemBank.getProblem(problemId).getContent());
    }

}
