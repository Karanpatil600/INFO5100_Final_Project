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
     VentureCapitalDirectory doclist;
    
    public VentureCapitalOrganization(String name)
    {
        super(Organization.Type.VentureCapital.getValue());
        doclist=new VentureCapitalDirectory();
    }

    

   

    public VentureCapitalDirectory getDoclist() {
        return doclist;
    }

    public void setDoclist(VentureCapitalDirectory doclist) {
        this.doclist = doclist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new VentureCapitalManagerRole());
       return role;
       
    }   
    
}




