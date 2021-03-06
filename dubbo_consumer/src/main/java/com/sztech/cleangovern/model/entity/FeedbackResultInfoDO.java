package com.sztech.cleangovern.model.entity;


import java.io.Serializable;
import java.util.Date;

public class FeedbackResultInfoDO implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_result_info.ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_result_info.PROBLEM_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private Integer problemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_result_info.RESULT_INFO
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private String checkResultInfo;

    private String rectResultInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback_result_info.CREATE_TIME
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_result_info.ID
     *
     * @return the value of feedback_result_info.ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_result_info.ID
     *
     * @param id the value for feedback_result_info.ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_result_info.PROBLEM_ID
     *
     * @return the value of feedback_result_info.PROBLEM_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_result_info.PROBLEM_ID
     *
     * @param problemId the value for feedback_result_info.PROBLEM_ID
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback_result_info.CREATE_TIME
     *
     * @return the value of feedback_result_info.CREATE_TIME
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback_result_info.CREATE_TIME
     *
     * @param createTime the value for feedback_result_info.CREATE_TIME
     *
     * @mbggenerated Tue Sep 25 10:17:34 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}