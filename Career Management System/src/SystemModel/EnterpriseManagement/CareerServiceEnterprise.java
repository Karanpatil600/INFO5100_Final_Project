/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.EnterpriseManagement;

import SystemModel.Role.CreatorAdminRole;
import SystemModel.Role.ServiceProviderAdminRole;
import SystemModel.Role.Role;
import SystemModel.Role.ServiceSeekerAdminRole;
import java.util.HashSet;



/**
 *
 * @author Ashish
 */
public class CareerServiceEnterprise extends Enterprise{
    
     public CareerServiceEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.CareerService);
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new CommunityAdminRole());
       
        role.add(new ServiceProviderAdminRole());
              
        role.add(new ServiceSeekerAdminRole());
        
        role.add(new CreatorAdminRole());
       
        return role;
        
    }
    
}
