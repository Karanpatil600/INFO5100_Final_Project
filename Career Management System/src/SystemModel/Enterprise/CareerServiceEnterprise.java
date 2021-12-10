/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Enterprise;

import SystemModel.Role.ServiceProviderAdminRole;
import SystemModel.Role.Role;
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
              
        //role.add(new HelpSeekerAdminRole());
        
        //role.add(new VolunteerAdminRole());
       
        //return role;
        return null;
    }
    
}
