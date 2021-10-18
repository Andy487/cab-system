package org.cabsystem.model;

import java.util.Date;

public class Emp {

  private Long empId;
  private String empName;
  private String address;
  private String city;
  private int contactNo;
  private int emergancyNo;
  private String gender;
  private Date dob;
  private String email;
  private String department;
  private String route;

  public Emp() {
  }
  public Emp(String empName, String address , String city, int contactNo , int emergancyNo , String gender , Date dob, String email, String department , String route){
    this.empName = empName;
    this.address = address;
    this.city = city;
    this.contactNo = contactNo;
    this.emergancyNo = emergancyNo;
    this.gender = gender;
    this.dob = dob;
    this.email = email;
    this.department = department;
    this.route = route;
  }
}