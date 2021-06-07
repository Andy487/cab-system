package org.cabsystem.model;

public class Cab {

  private Long cabId;
  private String cabNumber;
  private String driverName;
  private int capacity;

  public Cab() {}

  public Cab(String cabNumber, String driverName, int capacity) {
    this.cabNumber = cabNumber;
    this.capacity = capacity;
    this.driverName = driverName;
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

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  @Override
  public String toString() {
    return String.format(
      "Cab[cabId=%d, cabNumber=%s,  capacity='%d' , driverName='%s']",
      cabId,
      cabNumber,
      capacity,
      driverName
    );
  }
}
