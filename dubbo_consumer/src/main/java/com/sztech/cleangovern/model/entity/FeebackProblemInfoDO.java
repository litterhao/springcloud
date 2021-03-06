package com.sztech.cleangovern.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FeebackProblemInfoDO implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.PROBLEM_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private Integer problemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.DEPT_CODE
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String deptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.USER_TOKEN
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String userToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.SUBMITTER
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String submitter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.LINK_TEL
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String linkTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.FEEDBACK_TYPE_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private Integer feedbackTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.FEEDBACK_RESULT
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String feedbackResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.FEEDBACK_DESC
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String feedbackDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.FEEDBACK_TIME
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */

    private Date feedbackTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_problem_info.REMIND_COUNT
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private Integer remindCount;

    private String checkResultInfo;

    private String rectResultInfo;

    private List<String> tableName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.PROBLEM_ID
     *
     * @return the value of feedback_problem_info.PROBLEM_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.PROBLEM_ID
     *
     * @param problemId the value for feedback_problem_info.PROBLEM_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.DEPT_CODE
     *
     * @return the value of feedback_problem_info.DEPT_CODE
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.DEPT_CODE
     *
     * @param deptCode the value for feedback_problem_info.DEPT_CODE
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.USER_TOKEN
     *
     * @return the value of feedback_problem_info.USER_TOKEN
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.USER_TOKEN
     *
     * @param userToken the value for feedback_problem_info.USER_TOKEN
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.SUBMITTER
     *
     * @return the value of feedback_problem_info.SUBMITTER
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.SUBMITTER
     *
     * @param submitter the value for feedback_problem_info.SUBMITTER
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.LINK_TEL
     *
     * @return the value of feedback_problem_info.LINK_TEL
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public String getLinkTel() {
        return linkTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.LINK_TEL
     *
     * @param linkTel the value for feedback_problem_info.LINK_TEL
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.FEEDBACK_TYPE_ID
     *
     * @return the value of feedback_problem_info.FEEDBACK_TYPE_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public Integer getFeedbackTypeId() {
        return feedbackTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.FEEDBACK_TYPE_ID
     *
     * @param feedbackTypeId the value for feedback_problem_info.FEEDBACK_TYPE_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setFeedbackTypeId(Integer feedbackTypeId) {
        this.feedbackTypeId = feedbackTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.FEEDBACK_RESULT
     *
     * @return the value of feedback_problem_info.FEEDBACK_RESULT
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public String getFeedbackResult() {
        return feedbackResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.FEEDBACK_RESULT
     *
     * @param feedbackResult the value for feedback_problem_info.FEEDBACK_RESULT
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setFeedbackResult(String feedbackResult) {
        this.feedbackResult = feedbackResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.FEEDBACK_DESC
     *
     * @return the value of feedback_problem_info.FEEDBACK_DESC
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public String getFeedbackDesc() {
        return feedbackDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.FEEDBACK_DESC
     *
     * @param feedbackDesc the value for feedback_problem_info.FEEDBACK_DESC
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setFeedbackDesc(String feedbackDesc) {
        this.feedbackDesc = feedbackDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.FEEDBACK_TIME
     *
     * @return the value of feedback_problem_info.FEEDBACK_TIME
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getFeedbackTime() {
        return feedbackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.FEEDBACK_TIME
     *
     * @param feedbackTime the value for feedback_problem_info.FEEDBACK_TIME
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_problem_info.REMIND_COUNT
     *
     * @return the value of feedback_problem_info.REMIND_COUNT
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public Integer getRemindCount() {
        return remindCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_problem_info.REMIND_COUNT
     *
     * @param remindCount the value for feedback_problem_info.REMIND_COUNT
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setRemindCount(Integer remindCount) {
        this.remindCount = remindCount;
    }

    public String getCheckResultInfo() {
        return checkResultInfo;
    }

    public void setCheckResultInfo(String checkResultInfo) {
        this.checkResultInfo = checkResultInfo;
    }

    public String getRectResultInfo() {
        return rectResultInfo;
    }

    public void setRectResultInfo(String rectResultInfo) {
        this.rectResultInfo = rectResultInfo;
    }

    public List<String> getTableName() {
        return tableName;
    }

    public void setTableName(List<String> tableName) {
        this.tableName = tableName;
    }
}