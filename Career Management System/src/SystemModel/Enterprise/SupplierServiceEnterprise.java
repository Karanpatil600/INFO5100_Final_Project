/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Enterprise;

import SystemModel.Role.Role;
import SystemModel.Role.SupplierManagerRole;
import java.util.HashSet;

/**
 *
 * @author Ashish
 */
public class SupplierServiceEnterprise extends Enterprise  {
     public SupplierServiceEnterprise(String name)
    {
        super(name, Enterprise.EnterpriseType.SupplierService);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        new SupplierManagerRole();
        return role;
        
    }
}
