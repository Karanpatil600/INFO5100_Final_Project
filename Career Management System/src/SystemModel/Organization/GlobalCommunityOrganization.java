/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;
import SystemModel.GlobalCommunity.GlobalCommunityDirectory;
import SystemModel.Role.GlobalCommunityManagerRole;
import SystemModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Karan
 */

public class GlobalCommunityOrganization extends Organization {
   
    GlobalCommunityDirectory gcList;
    
    public GlobalCommunityOrganization()
    {
        super(Organization.Type.GCO.getValue());
        gcList=new GlobalCommunityDirectory();
    }

    public GlobalCommunityDirectory getGcList() {
        return gcList;
    }

    public void setGcList(GlobalCommunityDirectory gcList) {
        this.gcList = gcList;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new GlobalCommunityManagerRole());
       return role;
       
    }   
}




