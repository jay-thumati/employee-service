package com.employee.dao;

import com.employee.dto.EmployeeProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jthumati on 2/22/17.
 */
@Transactional
@Repository
public interface EmployeeProfileRepository extends CrudRepository<EmployeeProfile, Long>, QueryByExampleExecutor<EmployeeProfile> {

}