package org.cabsystem.model;

import java.sql.Date;
import java.sql.Time;
public class Route {

    private Long routeId;
    private Date dateFrom;
    private Date dateTo;
    private Time shift;

    public Route() {
    }

    public Route(Date dateFrom, Date dateTo, Time shift) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.shift = shift;
    }



}
