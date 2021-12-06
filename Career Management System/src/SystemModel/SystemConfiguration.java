/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel;



//import Business.Employee.Employee;
//import Business.Role.SystemAdministratorRole;
//import Business.UserAccount.UserAccount;
/**
 *
 * @author Karan
 */
public class SystemConfiguration {
     public static EcoSystem configure(){
   EcoSystem system= EcoSystem.getInstance();
   
//   Employee employee= system.getEmployeeDirectory().createEmployee("SYSTEM ADMIN");
//   UserAccount ua= system.getUserAccountDirectory().createUserAccount("username", "password", employee, new SystemAdministratorRole());
    
    return system;
    }
    
}
