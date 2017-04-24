package ru.nsn.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by bn on 24.03.2017.
 */
public class Site {
    final private SimpleIntegerProperty siteId = new SimpleIntegerProperty();
    private SimpleIntegerProperty siteNumberMf = new SimpleIntegerProperty();
    private SimpleIntegerProperty siteNumberYota = new SimpleIntegerProperty();
    private SimpleStringProperty siteAdress = new SimpleStringProperty();
    private SimpleIntegerProperty siteStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty siteStatus = new SimpleStringProperty();
    private SimpleStringProperty siteComment = new SimpleStringProperty();

    private SimpleIntegerProperty siteSurveyOwnerId = new SimpleIntegerProperty();
    private SimpleStringProperty siteSurveyOwner = new SimpleStringProperty();
    private SimpleObjectProperty<LocalDateTime> surveyDate = new SimpleObjectProperty<>();

    private SimpleObjectProperty<AllDateOfItemSite> surveyDateMap = new SimpleObjectProperty<>();

    private SimpleObjectProperty<LocalDate> surveyDatePlaned = new SimpleObjectProperty<>();
    private SimpleIntegerProperty statusSurveyId = new SimpleIntegerProperty();
    private SimpleStringProperty statusSurvey = new SimpleStringProperty();
    private SimpleStringProperty surveyComment = new SimpleStringProperty();

    private SimpleObjectProperty<LocalDate> foDate = new SimpleObjectProperty<>();

    private AllDateOfItemSite foDateMap = new AllDateOfItemSite();

    private SimpleIntegerProperty foStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty foStatus = new SimpleStringProperty();
    private SimpleStringProperty foComment = new SimpleStringProperty();

    private SimpleObjectProperty<LocalDate> tzEpuDate = new SimpleObjectProperty<>();

    private AllDateOfItemSite tzEpuDateMap = new AllDateOfItemSite();

    private SimpleIntegerProperty tzEpuStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty tzEpuStatus = new SimpleStringProperty();
    private SimpleStringProperty tzEpuComment = new SimpleStringProperty();

    private SimpleObjectProperty<LocalDate> sarfDate = new SimpleObjectProperty<>();

    private AllDateOfItemSite sarfDatemap = new AllDateOfItemSite();

    private SimpleObjectProperty<LocalDate> sarfDatePlaned = new SimpleObjectProperty<>();
    private SimpleIntegerProperty sarfStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty sarfStatus = new SimpleStringProperty();
    private SimpleStringProperty sarfComment = new SimpleStringProperty();

    private SimpleObjectProperty<LocalDate> apdate = new SimpleObjectProperty<>();

    private AllDateOfItemSite apdateMap = new AllDateOfItemSite();

    private SimpleIntegerProperty apStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty apStatus = new SimpleStringProperty();
    private SimpleStringProperty apComment = new SimpleStringProperty();

    private SimpleObjectProperty<LocalDate> tssrDate = new SimpleObjectProperty<>();

    private AllDateOfItemSite tssrDateMap = new AllDateOfItemSite();

    private SimpleObjectProperty<LocalDate> tssrDatePlaned = new SimpleObjectProperty<>();
    private SimpleIntegerProperty tssrStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty tssrStatus = new SimpleStringProperty();
    private SimpleStringProperty tssrComment = new SimpleStringProperty();

    private SimpleObjectProperty<LocalDate> rdDate = new SimpleObjectProperty<>();

    private AllDateOfItemSite rdDateMap = new AllDateOfItemSite();

    private SimpleObjectProperty<LocalDate> rdDatePllaned = new SimpleObjectProperty<>();
    private SimpleIntegerProperty rdStatusId = new SimpleIntegerProperty();
    private SimpleStringProperty rdStatus = new SimpleStringProperty();
    private SimpleStringProperty rdComment = new SimpleStringProperty();


    public Site(Integer siteId, Integer siteNumberMf, Integer siteNumberYota, String siteAdress, LocalDateTime surveydate) {
        setSiteId(siteId);
        setSiteNumberMf(siteNumberMf);
        setSiteNumberYota(siteNumberYota);
        setSiteAdress(siteAdress);
        setSurveyDate(surveydate);
    }

    public Site(Integer siteId) {
        setSiteId(siteId);
    }

    public int getSiteId() {
        return siteId.get();
    }

    public void setSiteId(int siteId) {
        this.siteId.set(siteId);
    }

    public SimpleIntegerProperty siteIdProperty() {
        return siteId;
    }

    public int getSiteNumberMf() {
        return siteNumberMf.get();
    }

    public void setSiteNumberMf(int siteNumberMf) {
        this.siteNumberMf.set(siteNumberMf);
    }

    public SimpleIntegerProperty siteNumberMfProperty() {
        return siteNumberMf;
    }

    public int getSiteNumberYota() {
        return siteNumberYota.get();
    }

    public void setSiteNumberYota(int siteNumberYota) {
        this.siteNumberYota.set(siteNumberYota);
    }

    public SimpleIntegerProperty siteNumberYotaProperty() {
        return siteNumberYota;
    }

    public String getSiteAdress() {
        return siteAdress.get();
    }

    public void setSiteAdress(String siteAdress) {
        this.siteAdress.set(siteAdress);
    }

    public SimpleStringProperty siteAdressProperty() {
        return siteAdress;
    }

    public int getSiteStatusId() {
        return siteStatusId.get();
    }

    public void setSiteStatusId(int siteStatusId) {
        this.siteStatusId.set(siteStatusId);
    }

    public SimpleIntegerProperty siteStatusIdProperty() {
        return siteStatusId;
    }

    public String getSiteStatus() {
        return siteStatus.get();
    }

    public void setSiteStatus(String siteStatus) {
        this.siteStatus.set(siteStatus);
    }

    public SimpleStringProperty siteStatusProperty() {
        return siteStatus;
    }

    public String getSiteComment() {
        return siteComment.get();
    }

    public void setSiteComment(String siteComment) {
        this.siteComment.set(siteComment);
    }

    public SimpleStringProperty siteCommentProperty() {
        return siteComment;
    }

    public int getSiteSurveyOwnerId() {
        return siteSurveyOwnerId.get();
    }

    public void setSiteSurveyOwnerId(int siteSurveyOwnerId) {
        this.siteSurveyOwnerId.set(siteSurveyOwnerId);
    }

    public SimpleIntegerProperty siteSurveyOwnerIdProperty() {
        return siteSurveyOwnerId;
    }

    public String getSiteSurveyOwner() {
        return siteSurveyOwner.get();
    }

    public void setSiteSurveyOwner(String siteSurveyOwner) {
        this.siteSurveyOwner.set(siteSurveyOwner);
    }

    public SimpleStringProperty siteSurveyOwnerProperty() {
        return siteSurveyOwner;
    }

    public LocalDateTime getSurveyDate() {
        this.surveyDate.set(surveyDateMap.getValue().getLastDateOfItemSite());
        return surveyDate.get();
    }

    public void setSurveyDate(LocalDateTime surveyDate) {
        this.surveyDate.set(surveyDate);
    }

    public SimpleObjectProperty<LocalDateTime> surveyDateProperty() {
        return surveyDate;
    }

    public LocalDate getSurveyDatePlaned() {
        return surveyDatePlaned.get();
    }

    public void setSurveyDatePlaned(LocalDate surveyDatePlaned) {
        this.surveyDatePlaned.set(surveyDatePlaned);
    }

    public SimpleObjectProperty<LocalDate> surveyDatePlanedProperty() {
        return surveyDatePlaned;
    }

    public int getStatusSurveyId() {
        return statusSurveyId.get();
    }

    public void setStatusSurveyId(int statusSurveyId) {
        this.statusSurveyId.set(statusSurveyId);
    }

    public SimpleIntegerProperty statusSurveyIdProperty() {
        return statusSurveyId;
    }

    public String getStatusSurvey() {
        return statusSurvey.get();
    }

    public void setStatusSurvey(String statusSurvey) {
        this.statusSurvey.set(statusSurvey);
    }

    public SimpleStringProperty statusSurveyProperty() {
        return statusSurvey;
    }

    public String getSurveyComment() {
        return surveyComment.get();
    }

    public void setSurveyComment(String surveyComment) {
        this.surveyComment.set(surveyComment);
    }

    public SimpleStringProperty surveyCommentProperty() {
        return surveyComment;
    }

    public LocalDate getFoDate() {
        return foDate.get();
    }

    public void setFoDate(LocalDate foDate) {
        this.foDate.set(foDate);
    }

    public SimpleObjectProperty<LocalDate> foDateProperty() {
        return foDate;
    }

    public int getFoStatusId() {
        return foStatusId.get();
    }

    public void setFoStatusId(int foStatusId) {
        this.foStatusId.set(foStatusId);
    }

    public SimpleIntegerProperty foStatusIdProperty() {
        return foStatusId;
    }

    public String getFoStatus() {
        return foStatus.get();
    }

    public void setFoStatus(String foStatus) {
        this.foStatus.set(foStatus);
    }

    public SimpleStringProperty foStatusProperty() {
        return foStatus;
    }

    public String getFoComment() {
        return foComment.get();
    }

    public void setFoComment(String foComment) {
        this.foComment.set(foComment);
    }

    public SimpleStringProperty foCommentProperty() {
        return foComment;
    }

    public LocalDate getTzEpuDate() {
        return tzEpuDate.get();
    }

    public void setTzEpuDate(LocalDate tzEpuDate) {
        this.tzEpuDate.set(tzEpuDate);
    }

    public SimpleObjectProperty<LocalDate> tzEpuDateProperty() {
        return tzEpuDate;
    }

    public int getTzEpuStatusId() {
        return tzEpuStatusId.get();
    }

    public void setTzEpuStatusId(int tzEpuStatusId) {
        this.tzEpuStatusId.set(tzEpuStatusId);
    }

    public SimpleIntegerProperty tzEpuStatusIdProperty() {
        return tzEpuStatusId;
    }

    public String getTzEpuStatus() {
        return tzEpuStatus.get();
    }

    public void setTzEpuStatus(String tzEpuStatus) {
        this.tzEpuStatus.set(tzEpuStatus);
    }

    public SimpleStringProperty tzEpuStatusProperty() {
        return tzEpuStatus;
    }

    public String getTzEpuComment() {
        return tzEpuComment.get();
    }

    public void setTzEpuComment(String tzEpuComment) {
        this.tzEpuComment.set(tzEpuComment);
    }

    public SimpleStringProperty tzEpuCommentProperty() {
        return tzEpuComment;
    }

    public LocalDate getSarfDate() {
        return sarfDate.get();
    }

    public void setSarfDate(LocalDate sarfDate) {
        this.sarfDate.set(sarfDate);
    }

    public SimpleObjectProperty<LocalDate> sarfDateProperty() {
        return sarfDate;
    }

    public LocalDate getSarfDatePlaned() {
        return sarfDatePlaned.get();
    }

    public void setSarfDatePlaned(LocalDate sarfDatePlaned) {
        this.sarfDatePlaned.set(sarfDatePlaned);
    }

    public SimpleObjectProperty<LocalDate> sarfDatePlanedProperty() {
        return sarfDatePlaned;
    }

    public int getSarfStatusId() {
        return sarfStatusId.get();
    }

    public void setSarfStatusId(int sarfStatusId) {
        this.sarfStatusId.set(sarfStatusId);
    }

    public SimpleIntegerProperty sarfStatusIdProperty() {
        return sarfStatusId;
    }

    public String getSarfStatus() {
        return sarfStatus.get();
    }

    public void setSarfStatus(String sarfStatus) {
        this.sarfStatus.set(sarfStatus);
    }

    public SimpleStringProperty sarfStatusProperty() {
        return sarfStatus;
    }

    public String getSarfComment() {
        return sarfComment.get();
    }

    public void setSarfComment(String sarfComment) {
        this.sarfComment.set(sarfComment);
    }

    public SimpleStringProperty sarfCommentProperty() {
        return sarfComment;
    }

    public LocalDate getApdate() {
        return apdate.get();
    }

    public void setApdate(LocalDate apdate) {
        this.apdate.set(apdate);
    }

    public SimpleObjectProperty<LocalDate> apdateProperty() {
        return apdate;
    }

    public int getApStatusId() {
        return apStatusId.get();
    }

    public void setApStatusId(int apStatusId) {
        this.apStatusId.set(apStatusId);
    }

    public SimpleIntegerProperty apStatusIdProperty() {
        return apStatusId;
    }

    public String getApStatus() {
        return apStatus.get();
    }

    public void setApStatus(String apStatus) {
        this.apStatus.set(apStatus);
    }

    public SimpleStringProperty apStatusProperty() {
        return apStatus;
    }

    public String getApComment() {
        return apComment.get();
    }

    public void setApComment(String apComment) {
        this.apComment.set(apComment);
    }

    public SimpleStringProperty apCommentProperty() {
        return apComment;
    }

    public LocalDate getTssrDate() {
        return tssrDate.get();
    }

    public void setTssrDate(LocalDate tssrDate) {
        this.tssrDate.set(tssrDate);
    }

    public SimpleObjectProperty<LocalDate> tssrDateProperty() {
        return tssrDate;
    }

    public LocalDate getTssrDatePlaned() {
        return tssrDatePlaned.get();
    }

    public void setTssrDatePlaned(LocalDate tssrDatePlaned) {
        this.tssrDatePlaned.set(tssrDatePlaned);
    }

    public SimpleObjectProperty<LocalDate> tssrDatePlanedProperty() {
        return tssrDatePlaned;
    }

    public int getTssrStatusId() {
        return tssrStatusId.get();
    }

    public void setTssrStatusId(int tssrStatusId) {
        this.tssrStatusId.set(tssrStatusId);
    }

    public SimpleIntegerProperty tssrStatusIdProperty() {
        return tssrStatusId;
    }

    public String getTssrStatus() {
        return tssrStatus.get();
    }

    public void setTssrStatus(String tssrStatus) {
        this.tssrStatus.set(tssrStatus);
    }

    public SimpleStringProperty tssrStatusProperty() {
        return tssrStatus;
    }

    public String getTssrComment() {
        return tssrComment.get();
    }

    public void setTssrComment(String tssrComment) {
        this.tssrComment.set(tssrComment);
    }

    public SimpleStringProperty tssrCommentProperty() {
        return tssrComment;
    }

    public LocalDate getRdDate() {
        return rdDate.get();
    }

    public void setRdDate(LocalDate rdDate) {
        this.rdDate.set(rdDate);
    }

    public SimpleObjectProperty<LocalDate> rdDateProperty() {
        return rdDate;
    }

    public LocalDate getRdDatePllaned() {
        return rdDatePllaned.get();
    }

    public void setRdDatePllaned(LocalDate rdDatePllaned) {
        this.rdDatePllaned.set(rdDatePllaned);
    }

    public SimpleObjectProperty<LocalDate> rdDatePllanedProperty() {
        return rdDatePllaned;
    }

    public int getRdStatusId() {
        return rdStatusId.get();
    }

    public void setRdStatusId(int rdStatusId) {
        this.rdStatusId.set(rdStatusId);
    }

    public SimpleIntegerProperty rdStatusIdProperty() {
        return rdStatusId;
    }

    public String getRdStatus() {
        return rdStatus.get();
    }

    public void setRdStatus(String rdStatus) {
        this.rdStatus.set(rdStatus);
    }

    public SimpleStringProperty rdStatusProperty() {
        return rdStatus;
    }

    public String getRdComment() {
        return rdComment.get();
    }

    public void setRdComment(String rdComment) {
        this.rdComment.set(rdComment);
    }

    public SimpleStringProperty rdCommentProperty() {
        return rdComment;
    }

    public AllDateOfItemSite getSurveyDateMap() {
        return surveyDateMap.get();
    }

    public void setSurveyDateMap(AllDateOfItemSite surveyDateMap) {
        this.surveyDateMap.set(surveyDateMap);
    }

    public SimpleObjectProperty<AllDateOfItemSite> surveyDateMapProperty() {
        return surveyDateMap;
    }

   /* public Date getDate() {
        return date;
    }

    public int getItemStatusId() {
        return itemStatusId;
    }

    public String getItemSatus() {
        return itemSatus;
    }

    public String getItemComment() {
        return itemComment;
    }
*/
}
