package ru.nsn.model;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import ru.nsn.interfaces.SiteFactory;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Borpernic on 26.03.2017.
 */
public class MapSiteFactory implements SiteFactory {

    private BidiMap<Integer, Site> sites = new DualHashBidiMap<>();


    @Override
    public Site getSite(int siteID) {
        return sites.get(siteID);
    }

    @Override
    public Site setSite(Site site) {
        return sites.put(site.getSiteId(), site);

    }

    @Override
    public void updateSite(Site site) {
        sites.put(site.getSiteId(), site);

    }

    @Override
    public void deleteSaite(int siteId) {
        sites.remove(siteId);
    }

    @Override
    public Iterator iterator() {
        return this.sites.mapIterator();
    }

    @Override
    public void forEach(Consumer action) {
//
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

   /* @Override
    public Site selectSite(int siteId) {
        return null;
    }*/
}
