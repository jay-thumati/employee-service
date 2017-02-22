package com.employee.service;

import com.employee.dto.EmployeeProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jthumati on 2/22/17.
 */
@Service
public class EmployeeProfileService {

    public List<EmployeeProfile> searchEmployees(Long id, String firstName, String lastName) {

        List<EmployeeProfile> employees = new ArrayList<>();
        EmployeeProfile employee = new EmployeeProfile();

        //Search for all employees
        if(firstName == null && lastName == null && id == null) {
            employee.setEmployeeID(1);
            employee.setFirstName("Jay");
            employee.setLastName("Thumati");
            employees.add(employee);

            employee = new EmployeeProfile();
            employee.setEmployeeID(2);
            employee.setFirstName("Naveen");
            employee.setLastName("Yeluri");
            employees.add(employee);

            employee = new EmployeeProfile();
            employee.setEmployeeID(3);
            employee.setFirstName("Vivek");
            employee.setLastName("Guddanti");
            employees.add(employee);
        }

        return employees;
    }

}
