package ru.nsn.model;

import java.time.LocalDateTime;

public class SiteBuilder {
    private Integer siteId;
    private Integer siteNumberMf;
    private Integer siteNumberYota;
    private String siteAdress;
    private LocalDateTime surveydate;

    public SiteBuilder setSiteId(Integer siteId) {
        this.siteId = siteId;
        return this;
    }

    public SiteBuilder setSiteNumberMf(Integer siteNumberMf) {
        this.siteNumberMf = siteNumberMf;
        return this;
    }

    public SiteBuilder setSiteNumberYota(Integer siteNumberYota) {
        this.siteNumberYota = siteNumberYota;
        return this;
    }

    public SiteBuilder setSiteAdress(String siteAdress) {
        this.siteAdress = siteAdress;
        return this;
    }

    public SiteBuilder setSurveydate(LocalDateTime surveydate) {
        this.surveydate = surveydate;
        return this;
    }

    public Site createSite() {
        return new Site(siteId, siteNumberMf, siteNumberYota, siteAdress, surveydate);
    }
}