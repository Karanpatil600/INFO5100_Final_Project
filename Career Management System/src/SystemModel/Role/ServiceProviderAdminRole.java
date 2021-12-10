/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemModel.EcoSystem;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.ServiceProvider.ServiceProviderAdminUI;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class ServiceProviderAdminRole extends Role {
    
@Override
public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new ServiceProviderAdminUI(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise/*,system*/);
       //return null;
    }   
        @Override
        public String toString()
{
   return Role.RoleType.ServiceProviderAdmin.getValue();
}  
}
