package org.cabsystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "RosterRequest")
public class RequestRoster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requestRosterId;
    private Long empId;
    private String date;
    private String shift;
    private String location;

    // public requestRoster() { }
    public void requestRoster(Long empId, String date, String shift, String location) {
        this.empId = empId;
        this.date = date;
        this.shift = shift;
        this.location = location;
    }

    public Long getRequestRosterId() {
        return requestRosterId;
      }

      public void setRequestRosterId(Long requestRosterId) {
        this.requestRosterId = requestRosterId;
      }

      public Long getEmpId(){
          return empId;
      }
public void setEmpId(){
    this.empId = empId;
}
public String getDate() {
    return date;
}
public void setDate() {
    this.date = date;

}
public String getShift(){
    return shift;
}
public void setShift(){
    this.shift =shift;
}
public String getLocation(){
    return location;
}
public void setLocation(){
    this.location = location;
}
    @Override
    public String toString() {
        return String.format("Roster[requestRosterId=%d, empId=%d,  date='%s' , shift='%s', location='%s']",
                requestRosterId, empId, date, shift, location

        );
    }
}
