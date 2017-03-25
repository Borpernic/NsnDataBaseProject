package ru.nsn.model;

import ru.nsn.interfaces.SiteFactory;

import java.util.Date;

/**
 * Created by bn on 24.03.2017.
 */
public class Site implements SiteFactory {
    private int siteId;
    private int siteNumberMf;
    private int siteNumberYota;
    private Date surveyDate;
    private Date surveyDatePlaned;
    private int statusSurvey;
    private String surveyComment;
    private Date foDate;
    private int foStatus;
    private String foComment;
    private Date tzEpuDate;
    private int tzEpuStatus;
    private String tzEpuComment;
    private Date sarfDate;
    private Date sarfDatePlaned;
    private int sarfStatus;
    private String sarfComment;
    private Date apdate;
    private int apStatus;
    private Date tssrDate;
    private Date tssrDatePlaned;
    private int tssrStatus;
    private String tssrComment;
    private Date rdDate;
    private Date rdDatePllaned;
    private int rdSatatus;
    private String rdComment;

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getSiteNumberMf() {
        return siteNumberMf;
    }

    public void setSiteNumberMf(int siteNumberMf) {
        this.siteNumberMf = siteNumberMf;
    }

    public int getSiteNumberYota() {
        return siteNumberYota;
    }

    public void setSiteNumberYota(int siteNumberYota) {
        this.siteNumberYota = siteNumberYota;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public Date getSurveyDatePlaned() {
        return surveyDatePlaned;
    }

    public void setSurveyDatePlaned(Date surveyDatePlaned) {
        this.surveyDatePlaned = surveyDatePlaned;
    }

    public int getStatusSurvey() {
        return statusSurvey;
    }

    public void setStatusSurvey(int statusSurvey) {
        this.statusSurvey = statusSurvey;
    }

    public String getSurveyComment() {
        return surveyComment;
    }

    public void setSurveyComment(String surveyComment) {
        this.surveyComment = surveyComment;
    }

    public Date getFoDate() {
        return foDate;
    }

    public void setFoDate(Date foDate) {
        this.foDate = foDate;
    }

    public int getFoStatus() {
        return foStatus;
    }

    public void setFoStatus(int foStatus) {
        this.foStatus = foStatus;
    }

    public String getFoComment() {
        return foComment;
    }

    public void setFoComment(String foComment) {
        this.foComment = foComment;
    }

    public Date getTzEpuDate() {
        return tzEpuDate;
    }

    public void setTzEpuDate(Date tzEpuDate) {
        this.tzEpuDate = tzEpuDate;
    }

    public int getTzEpuStatus() {
        return tzEpuStatus;
    }

    public void setTzEpuStatus(int tzEpuStatus) {
        this.tzEpuStatus = tzEpuStatus;
    }

    public String getTzEpuComment() {
        return tzEpuComment;
    }

    public void setTzEpuComment(String tzEpuComment) {
        this.tzEpuComment = tzEpuComment;
    }

    public Date getSarfDate() {
        return sarfDate;
    }

    public void setSarfDate(Date sarfDate) {
        this.sarfDate = sarfDate;
    }

    public Date getSarfDatePlaned() {
        return sarfDatePlaned;
    }

    public void setSarfDatePlaned(Date sarfDatePlaned) {
        this.sarfDatePlaned = sarfDatePlaned;
    }

    public int getSarfStatus() {
        return sarfStatus;
    }

    public void setSarfStatus(int sarfStatus) {
        this.sarfStatus = sarfStatus;
    }

    public String getSarfComment() {
        return sarfComment;
    }

    public void setSarfComment(String sarfComment) {
        this.sarfComment = sarfComment;
    }

    public Date getApdate() {
        return apdate;
    }

    public void setApdate(Date apdate) {
        this.apdate = apdate;
    }

    public int getApStatus() {
        return apStatus;
    }

    public void setApStatus(int apStatus) {
        this.apStatus = apStatus;
    }

    public Date getTssrDate() {
        return tssrDate;
    }

    public void setTssrDate(Date tssrDate) {
        this.tssrDate = tssrDate;
    }

    public Date getTssrDatePlaned() {
        return tssrDatePlaned;
    }

    public void setTssrDatePlaned(Date tssrDatePlaned) {
        this.tssrDatePlaned = tssrDatePlaned;
    }

    public int getTssrStatus() {
        return tssrStatus;
    }

    public void setTssrStatus(int tssrStatus) {
        this.tssrStatus = tssrStatus;
    }

    public String getTssrComment() {
        return tssrComment;
    }

    public void setTssrComment(String tssrComment) {
        this.tssrComment = tssrComment;
    }

    public Date getRdDate() {
        return rdDate;
    }

    public void setRdDate(Date rdDate) {
        this.rdDate = rdDate;
    }

    public Date getRdDatePllaned() {
        return rdDatePllaned;
    }

    public void setRdDatePllaned(Date rdDatePllaned) {
        this.rdDatePllaned = rdDatePllaned;
    }

    public int getRdSatatus() {
        return rdSatatus;
    }

    public void setRdSatatus(int rdSatatus) {
        this.rdSatatus = rdSatatus;
    }

    public String getRdComment() {
        return rdComment;
    }

    public void setRdComment(String rdComment) {
        this.rdComment = rdComment;
    }

    @Override
    public Site getSite(int siteID) {
        return null;
    }

    @Override
    public Site setSite(Site site) {
        return null;
    }

    @Override
    public void updateSite(Site site) {

    }

    @Override
    public void deleteSaite(int siteId) {

    }

    @Override
    public Site selectSite(int siteId) {
        return null;
    }
}
