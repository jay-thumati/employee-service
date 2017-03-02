package com.employee.service;

import com.employee.dao.EmployeeProfileRepository;
import com.employee.dto.EmployeeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jthumati on 2/22/17.
 */
@Service
public class EmployeeProfileService {

    @Autowired
    private EmployeeProfileRepository empProfileRepository;

    public List<EmployeeProfile> searchEmployees(Long id, String firstName, String lastName) {

        List<EmployeeProfile> employees = new ArrayList<>();

        EmployeeProfile emp = new EmployeeProfile();
        emp.setId(id);
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        Example<EmployeeProfile> example = Example.of(emp);

        Iterable<EmployeeProfile> iterable = empProfileRepository.findAll(example);
        iterable.forEach(employees::add);

        return employees;
    }

}
