/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Enterprise;

import SystemModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Ashish
 */
public class GlobalCommunityEnterprise extends Enterprise {
     public GlobalCommunityEnterprise(String name){
        super(name,Enterprise.EnterpriseType.GlobalCommunityEnterprise);
    }
    
      @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new HospitalAdminRole());
        return role;
        
    }
}