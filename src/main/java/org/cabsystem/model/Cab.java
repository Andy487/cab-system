package org.cabsystem.model;

public class Cab {

  private Long cabId;
  private String cabNumber;
  private int capacity;
  private int availability;
  private String driverName;
  private int driverNumber;


  public Cab() {}

  public Cab(String cabNumber, String driverName, int capacity,int availability,int driverNumber) {
    this.cabNumber = cabNumber;
    this.capacity = capacity;
    this.driverName = driverName;
    this.availability = availability;
    this.driverNumber = driverNumber;
  }

  public Long getCabId() {
    return cabId;
  }

  public void setCabId(Long cabId) {
    this.cabId = cabId;
  }

  public String getCabNumber() {
    return cabNumber;
  }

  public void setCabNumber(String cabNumber) {
    this.cabNumber = cabNumber;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getAvailability() {
    return availability;
  }

  public void setAvailability(int capacity) {
    this.availability = availability;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public int getDriverNumber() {
    return driverNumber;
  }

  public void setDriverNumber(int driverNumber) {
    this.driverNumber = driverNumber;
  }

  @Override
  public String toString() {
    return String.format(
      "Cab[cabId=%d, cabNumber=%s,  capacity='%d' ,availability = %d , driverName='%s ,driverNumber = %d']",
      cabId,
      cabNumber,
      capacity,
            availability,
      driverName,
            driverNumber
    );
  }
}
