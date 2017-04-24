package ru.nsn.model;


import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.io.File;
import java.time.LocalDateTime;

/**
 * Created by Borpernic on 15.04.2017.
 */
public class SitesDataBaseModel {

    //private final ObservableList<Site> siteList = FXCollections.observableArrayList();
    private final ObservableList<Site> siteList = FXCollections.observableArrayList(site ->
            new Observable[]{site.siteIdProperty(), site.siteNumberMfProperty(), site.siteNumberYotaProperty()});
    private final ObservableMap<Integer, Site> siteMap = FXCollections.observableHashMap();
    private final ObjectProperty<Site> currentSite = new SimpleObjectProperty<Site>(null);


    public ObservableMap<Integer, Site> getSiteMap() {
        return siteMap;
    }

    public ObservableList<Site> getSiteList() {
        return siteList;
    }

    public ObjectProperty<Site> currentSiteProperty() {
        return currentSite;
    }


    public final Site getCurrentSite() {

        return currentSite.get();
    }

    public final void setCurrentSite(Site site) {
        currentSite.set(site);
    }

    public void loadSiteDabase(File file) {
        siteList.setAll(
                new SiteBuilder().setSiteId(12).setSiteNumberMf(23).setSiteNumberYota(34).setSiteAdress("sdfsdf1")
                        .setSurveydate(LocalDateTime.now()).createSite(),
                new SiteBuilder().setSiteId(22).setSiteNumberMf(33).setSiteNumberYota(44).setSiteAdress("sdfsdf2")
                        .setSurveydate(LocalDateTime.now()).createSite(),
                new SiteBuilder().setSiteId(67).setSiteNumberMf(33).setSiteNumberYota(44).setSiteAdress("sdfsdf3")
                        .setSurveydate(LocalDateTime.now()).createSite(),
                new SiteBuilder().setSiteId(272).setSiteNumberMf(33).setSiteNumberYota(44).setSiteAdress("sdfsdf4")
                        .setSurveydate(LocalDateTime.now()).createSite());


    }
}
