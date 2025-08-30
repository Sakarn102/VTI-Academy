package com.vti.backend.businesslayer;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import java.util.List;

public interface IUserService {
    // 2. Viết function để user nhập vào id project, sau đó in ra tất cả các employee trong project đó (in ra dạng table)
    public List<Employee> getEmployeesByProjectId(int projectId) throws Exception;

    // 3. Viết function để user có thể lấy ra tất cả Manager của các project (in ra dạng table)
    public List<Manager> getManager() throws Exception;

    //4.
    //Viết chức năng login vào manager, User sẽ nhập Email và Password trên giao diện login
    //Chương trình phải kiểm tra được các hợp lệ của các thuộc tính
    // Email: đúng định dạng email. (VD: nguyen.vannam@vti.com.vn)
    // Password: nhập từ 6 tới 12 ký tự
    Manager loginManager(String email, String passWord) throws Exception;
}
