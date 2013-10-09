package com.app.entity;
// Generated 2013-07-03 23:10:05 by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * MSingletask generated by hbm2java
 */
public class MSingletask implements java.io.Serializable {

    private int id;
    private MDicionary MDicionaryBySiProject;
    private MDicionary MDicionaryBySiIssuesize;
    private MAttachment MAttachment;
    private MUser MUserBySiExecutor;
    private MDicionary MDicionaryBySiPriority;
    private MUser MUserBySiAuthor;
    private MDicionary MDicionaryBySiIssuetype;
    private String chTitle;
    private String chDescription;
    private String chAddinfo;
    private Date dtCreatedate;
    private Date dtFinishdate;
    private String chTasknumber;

    public MSingletask() {
    }

    public MSingletask(int id) {
        this.id = id;
    }

    public MSingletask(int id, MDicionary MDicionaryBySiProject, MDicionary MDicionaryBySiIssuesize, MAttachment MAttachment, MUser MUserBySiExecutor, MDicionary MDicionaryBySiPriority, MUser MUserBySiAuthor, MDicionary MDicionaryBySiIssuetype, String chTitle, String chDescription, String chAddinfo, Date dtCreatedate, Date dtFinishdate, String chTasknumber) {
        this.id = id;
        this.MDicionaryBySiProject = MDicionaryBySiProject;
        this.MDicionaryBySiIssuesize = MDicionaryBySiIssuesize;
        this.MAttachment = MAttachment;
        this.MUserBySiExecutor = MUserBySiExecutor;
        this.MDicionaryBySiPriority = MDicionaryBySiPriority;
        this.MUserBySiAuthor = MUserBySiAuthor;
        this.MDicionaryBySiIssuetype = MDicionaryBySiIssuetype;
        this.chTitle = chTitle;
        this.chDescription = chDescription;
        this.chAddinfo = chAddinfo;
        this.dtCreatedate = dtCreatedate;
        this.dtFinishdate = dtFinishdate;
        this.chTasknumber = chTasknumber;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MDicionary getMDicionaryBySiProject() {
        return this.MDicionaryBySiProject;
    }

    public void setMDicionaryBySiProject(MDicionary MDicionaryBySiProject) {
        this.MDicionaryBySiProject = MDicionaryBySiProject;
    }

    public MDicionary getMDicionaryBySiIssuesize() {
        return this.MDicionaryBySiIssuesize;
    }

    public void setMDicionaryBySiIssuesize(MDicionary MDicionaryBySiIssuesize) {
        this.MDicionaryBySiIssuesize = MDicionaryBySiIssuesize;
    }

    public MAttachment getMAttachment() {
        return this.MAttachment;
    }

    public void setMAttachment(MAttachment MAttachment) {
        this.MAttachment = MAttachment;
    }

    public MUser getMUserBySiExecutor() {
        return this.MUserBySiExecutor;
    }

    public void setMUserBySiExecutor(MUser MUserBySiExecutor) {
        this.MUserBySiExecutor = MUserBySiExecutor;
    }

    public MDicionary getMDicionaryBySiPriority() {
        return this.MDicionaryBySiPriority;
    }

    public void setMDicionaryBySiPriority(MDicionary MDicionaryBySiPriority) {
        this.MDicionaryBySiPriority = MDicionaryBySiPriority;
    }

    public MUser getMUserBySiAuthor() {
        return this.MUserBySiAuthor;
    }

    public void setMUserBySiAuthor(MUser MUserBySiAuthor) {
        this.MUserBySiAuthor = MUserBySiAuthor;
    }

    public MDicionary getMDicionaryBySiIssuetype() {
        return this.MDicionaryBySiIssuetype;
    }

    public void setMDicionaryBySiIssuetype(MDicionary MDicionaryBySiIssuetype) {
        this.MDicionaryBySiIssuetype = MDicionaryBySiIssuetype;
    }

    public String getChTitle() {
        return this.chTitle;
    }

    public void setChTitle(String chTitle) {
        this.chTitle = chTitle;
    }

    public String getChDescription() {
        return this.chDescription;
    }

    public void setChDescription(String chDescription) {
        this.chDescription = chDescription;
    }

    public String getChAddinfo() {
        return this.chAddinfo;
    }

    public void setChAddinfo(String chAddinfo) {
        this.chAddinfo = chAddinfo;
    }

    public Date getDtCreatedate() {
        return this.dtCreatedate;
    }

    public void setDtCreatedate(Date dtCreatedate) {
        this.dtCreatedate = dtCreatedate;
    }

    public Date getDtFinishdate() {
        return this.dtFinishdate;
    }

    public void setDtFinishdate(Date dtFinishdate) {
        this.dtFinishdate = dtFinishdate;
    }

    public String getChTasknumber() {
        return this.chTasknumber;
    }

    public void setChTasknumber(String chTasknumber) {
        this.chTasknumber = chTasknumber;
    }
}