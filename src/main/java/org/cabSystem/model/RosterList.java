package org.cabSystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RosterList {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long rosterId;
    private String empId;
    // private String cabId;
    private String routeId;
    private String dateFrom;
    private String dateTo;
    private String shift;

    public RosterList() {}

    public RosterList(String empId,String routeId,String dateFrom,  String dateTo,String shift ) {
        // this.routeId = routeId;
        this.dateFrom= dateFrom;
        this.dateTo = dateTo;
        this.shift= shift;
        }

    @Override
    public String toString() {
        return String.format(
                "Customer[rosterId=%d, empId=%d,  routeId='%s' , dateFrom='%s', dateTo='%s',shift='%s']",

                rosterId, empId ,routeId,dateFrom,dateTo,shift
                );
    }

//  //  public Long getId() {
//        return id;
//    }
}