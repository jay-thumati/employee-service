package com.employee.controller;

import com.employee.dto.EmployeeProfile;
import com.employee.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jthumati on 2/22/17.
 */
@RestController
public class EmployeeProfileController {

    @Autowired
    EmployeeProfileService employeeProfileService;

    @RequestMapping(value = "/employeeProfile/search", method = RequestMethod.GET)
    public List<EmployeeProfile> searchEmployees(@RequestParam(value="id", required=false) Long id,
                                                 @RequestParam(value="firstName", required=false) String firstName,
                                                 @RequestParam(value="lastName", required=false) String lastName) {
        return employeeProfileService.searchEmployees(id, firstName, lastName);
    }

}
