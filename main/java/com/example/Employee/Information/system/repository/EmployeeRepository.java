package com.example.Employee.Information.system.repository;


import com.example.Employee.Information.system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface EmployeeRepository extends JpaRepository <Employee,Long> {





    Employee getById(int id);


    Employee findByFirstName(String firstName);
}


