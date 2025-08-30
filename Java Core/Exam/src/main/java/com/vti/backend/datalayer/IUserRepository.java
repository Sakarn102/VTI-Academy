package com.vti.backend.datalayer;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import java.util.List;

public interface IUserRepository {
    public List<Employee> getEmployeesByProjectId(int projectId) throws Exception;
    public List<Manager> getManager() throws Exception;
    Manager loginManager(String email, String passWord) throws Exception;
}
