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
import SystemUIGlobalCommunityAdminUI.GlobalCommunityAdminUI;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class GlobalCommunityEnterpriseAdminRole extends Role{
        @Override
    public JPanel createWorkArea(JPanel workarea,UserAccount UserAccount,Organization organization,Enterprise enterprise,EcoSystem ecoSystem){
        return new GlobalCommunityAdminUI(workarea,UserAccount,organization,enterprise,ecoSystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.HospitalAdmin.getValue();
}
}
