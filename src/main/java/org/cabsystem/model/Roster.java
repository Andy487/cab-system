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
  private String cabId;
  private String driverName;
  private String driverNumber;



  public Roster() {}

  public Roster(
    String empId,
    String routeId,
    String tripDate,
    String shift,
    String cabId,
    String driverName,
    String driverNumber
  ) {
    this.routeId = routeId;
    this.empId = empId;
    this.tripDate = tripDate;
    this.shift = shift;
    this.cabId = cabId;
    this.driverName = driverName;
    this.driverNumber = driverNumber;
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

  public String getShift() {
    return shift;
  }

  public void setShift(String shift) {
    this.shift = shift;
  }

  public String getCabId() {
    return cabId;
  }

  public void setCabId(String cabId) {
    this.cabId = cabId;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public String getDriverNumber() {
    return driverNumber;
  }

  public void setDriverNumber(String driverNumber) {
    this.driverNumber = driverNumber;
  }

  @Override
  public String toString() {
    return String.format(
      "Roster[rosterId=%d, empId=%s,  routeId='%s' , tripDate='%s', cabId='%s',shift='%s',driverName='%s',driverNumber='%s']",
      rosterId,
      empId,
      routeId,
      tripDate,
      cabId,
      shift,
      driverName,
      driverNumber
    );
  }
}
