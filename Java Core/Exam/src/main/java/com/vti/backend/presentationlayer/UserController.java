package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import java.util.List;

public class UserController {
    private IUserService userService;

    public UserController() {
        userService = new UserService();
    }

    public List<Employee> getEmployeesByProjectId(int projectId) throws Exception {
        return userService.getEmployeesByProjectId(projectId);
    }

    public List<Manager> getManager() throws Exception {
        return userService.getManager();
    }

    public Manager loginManager(String email, String passWord) throws Exception {
        return userService.loginManager(email, passWord);
    }

}
