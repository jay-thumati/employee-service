package com.employee.dto;

/**
 * Created by jthumati on 2/22/17.
 */
public class EmployeeProfile {

    private long employeeID;
    private String firstName;
    private String lastName;


    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
