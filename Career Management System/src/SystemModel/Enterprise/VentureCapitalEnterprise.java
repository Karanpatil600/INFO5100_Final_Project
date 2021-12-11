/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Enterprise;

//import SystemModel.Role.CreatorRole;
//import SystemModel.Role.GlobalCommunityManagerRole; 
//import SystemModel.Role.VentureCapitalAdminRole
import SystemModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Ashish
 */
public class VentureCapitalEnterprise extends Enterprise{
    public VentureCapitalEnterprise(String name){
        super(name,Enterprise.EnterpriseType.VentureCapital);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new GlobalCommunityManagerRole());
       // role.add(new CreatorRole());
        return role;       
    }
}
