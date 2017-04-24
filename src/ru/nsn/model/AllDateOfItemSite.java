package ru.nsn.model;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Borpernic on 22.04.2017.
 */
public class AllDateOfItemSite {
    private Map<LocalDateTime, DateOfItemSite> dateOfItemSiteMap = new TreeMap<>();

    public Map<LocalDateTime, DateOfItemSite> getDateOfItemSiteMap() {
        return dateOfItemSiteMap;
    }

    public void setDateOfItemSiteMap(Map<LocalDateTime, DateOfItemSite> dateOfItemSiteMap) {
        this.dateOfItemSiteMap = dateOfItemSiteMap;
    }

    public LocalDateTime getFirstDateOfItemSite() {


        return dateOfItemSiteMap.size() > 0 ? dateOfItemSiteMap.get(0).date : null;
    }

    public LocalDateTime getLastDateOfItemSite() {

        return dateOfItemSiteMap.size() > 0 ? dateOfItemSiteMap.get(dateOfItemSiteMap.size()).date : null;
    }
}
