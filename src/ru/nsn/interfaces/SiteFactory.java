package ru.nsn.interfaces;

import ru.nsn.model.Site;

/**
 * Created by ${Borpernic} on 24.03.2017.
 */

public interface SiteFactory {
    Site getSite(long siteID);
    Site setSite(Site site);
    void  updateSite(Site site);
    void  deleteSaite(long siteId);
    Site selectSite(long siteId);
}
