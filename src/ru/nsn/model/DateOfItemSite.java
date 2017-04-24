package ru.nsn.model;

import java.time.LocalDateTime;

/**
 * Created by Borpernic on 22.04.2017.
 */

class DateOfItemSite {
    final LocalDateTime date;
    final int itemStatusId;
    final String itemSatus;
    final String itemComment;

    public DateOfItemSite(final LocalDateTime date, final int itemStatusId, final String itemSatus, final String itemComment) {
        this.date = date;
        this.itemStatusId = itemStatusId;
        this.itemSatus = itemSatus;
        this.itemComment = itemComment;
    }
}