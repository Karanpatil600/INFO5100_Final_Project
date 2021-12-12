/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Organization;

import SystemModel.VentureCapital.VentureCapitalDirectory;
import SystemModel.Role.VentureCapitalManagerRole;
import SystemModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Ashish
 */
public class VentureCapitalOrganization extends Organization{
     
    VentureCapitalDirectory vcList;
    
    public VentureCapitalOrganization(String name)
    {
        super(Organization.Type.VentureCapital.getValue());
        vcList=new VentureCapitalDirectory();
    }

    public VentureCapitalDirectory getVcList() {
        return vcList;
    }

    public void setVcList(VentureCapitalDirectory vcList) {
        this.vcList = vcList;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new VentureCapitalManagerRole());
       return role;
       
    }   
    
}




