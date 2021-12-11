/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.GlobalCommunity.GlobalCommunityDirectory;
import SystemModel.Role.GlobalCommunityAdminRole;
import SystemModel.Role.GlobalCommunityManagerRole;

import SystemModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Karan
 */

public class GlobalCommunityOrganization extends Organization {
   
    GlobalCommunityDirectory gclist;
    
    public GlobalCommunityOrganization()
    {
        super(Organization.Type.GCO.getValue());
        gclist=new GlobalCommunityDirectory();
    }

    public GlobalCommunityDirectory getNgolist() {
        return gclist;
    }

    public void setNgolist(GlobalCommunityDirectory ngolist) {
        this.gclist = ngolist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new GlobalCommunityManagerRole());
       return role;
       
    }   
}




