/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.UserAccount;

import SystemModel.Employee.Employee;
import SystemModel.Role.Role;
import SystemModel.WorkFlow.WorkRequestList;

/**
 *
 * @author Karan
 */

public class UserAccount 
{
    private String userName;
    private String password;
    private Employee employee;
    private Role role;
    private WorkRequestList workQueue;

    public UserAccount() {
        workQueue = new WorkRequestList();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkRequestList getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkRequestList workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return userName;
    }
    
}

 

