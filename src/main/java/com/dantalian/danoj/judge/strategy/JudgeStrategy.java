package com.dantalian.danoj.judge.strategy;

import com.dantalian.danoj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo dojudge(JudgeContext judgeContext);
}