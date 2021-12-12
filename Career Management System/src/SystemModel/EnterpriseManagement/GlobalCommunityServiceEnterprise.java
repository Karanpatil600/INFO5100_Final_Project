/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.EnterpriseManagement;

import SystemModel.Role.Role;
import java.util.HashSet;
import SystemModel.Role.GlobalCommunityManagerRole;


/**  
 *
 * @author Ashish
 */
public class GlobalCommunityServiceEnterprise extends Enterprise {
     public GlobalCommunityServiceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.GlobalCommunity);
    }
    
      @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new GlobalCommunityManagerRole()); 
       
        return role;
        
    }
}
