/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.EnterpriseManagement;

import SystemModel.Role.VentureCapitalAdminRole; 
import SystemModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Ashish
 */
public class VentureCapitalServiceEnterprise extends Enterprise{
    
    public VentureCapitalServiceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.VentureCapital);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VentureCapitalAdminRole());
       
        return role;       
    }
}
