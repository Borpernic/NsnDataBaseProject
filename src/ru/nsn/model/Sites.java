package ru.nsn.model;

import ru.nsn.interfaces.SiteFactory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Borpernic on 26.03.2017.
 */
public class Sites implements SiteFactory {

    private ArrayList<Site> sites;

    public Sites(Collection<Site> sites) {
        this.sites.addAll(sites);
    }

    @Override
    public Site getSite(int siteID) {
        return sites.get(siteID);
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
