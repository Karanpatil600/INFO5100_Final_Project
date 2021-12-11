/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.Employee.EmployeeDirectory;
import SystemModel.Role.Role;
import SystemModel.UserAccount.UserAccountDirectory;
import SystemModel.Creator.CreatorDirectory;
//import SystemModel.WorkQueue.WorkQueue;
import java.util.HashSet;

/**
 *
 * @author Karan
 */

public abstract class Organization {
    
    private String name;
    private String organizationName;
//    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int count=0;
    public HashSet<Role> role;
    
    public enum Type 
    {
        ServiceProvider("ServiceProvider Organization"),
        ServiceSeeker("ServiceSeeker Organization"),
        Creator("Creator Organization"),
        GCO("GlobalCommunity Organization"),
        Donor("Donor Organization"),
        Supplier("Supplier Organization"),
        Doctor("Doctor Organization");
        
        private String value;
        private Type(String value)
        {
            this.value = value;
        }
        public String getValue()
        {
            return value;
        }
    }
    
    public Organization (String name)
    {
      this.name = name;
      //workQueue = new WorkQueue();
      employeeDirectory = new EmployeeDirectory();
      userAccountDirectory = new UserAccountDirectory();
      organizationID = count;
      role = new HashSet<>();
      ++count;        
    }

    
   public abstract HashSet<Role> getSupportedRole();

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

   public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
       this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationCode() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
//
//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    
    
    
    
    @Override
    public String toString()
    {
        return name;
    }
}












