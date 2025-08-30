package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService() {
        userRepository = new UserRepository();
    }

    @Override
    public List<Employee> getEmployeesByProjectId(int projectId) throws Exception {
        return userRepository.getEmployeesByProjectId(projectId);
    }

    @Override
    public List<Manager> getManager() throws Exception {
        return userRepository.getManager();
    }

    @Override
    public Manager loginManager(String email, String passWord) throws Exception {
        return userRepository.loginManager(email, passWord);
    }
}
