package org.cabsystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "RosterList")
public class Roster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rosterId;
    private String empId;
    private String routeId;
    private String tripDate;
    private String shift;

    public Roster() {
    }

    public Roster(String empId, String routeId, String tripDate, String shift) {
        this.routeId = routeId;
        this.empId = empId;
        this.tripDate = tripDate;
        
        this.shift = shift;
    }

    public Long getRosterId() {
        return rosterId;
    }

    public void setRosterId(Long rosterId) {
        this.rosterId = rosterId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getDate() {
        return tripDate;
    }

    public void getDate(String tripDate) {
        this.tripDate = tripDate;
    }

    // public String getDateTo() {
    //     return dateTo;
    // }

    // public void setDateTo(String dateTo) {
    //     this.dateTo = dateTo;
    // }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return String.format(
                "Roster[rosterId=%d, empId=%s,  routeId='%s' , dateFrom='%s', dateTo='%s',shift='%s']",
                rosterId, empId, routeId, dateFrom, dateTo, shift
        );
    }


}