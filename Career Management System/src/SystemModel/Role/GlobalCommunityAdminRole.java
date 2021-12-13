/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.GlobalCommunityEnterprise.GlobalCommunityAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Karan
 */
public class GlobalCommunityAdminRole extends Role{
        @Override
    public JPanel createWorkArea(JPanel workArea,UserAccount UserAccount,Organization organization,Enterprise enterprise,EcoSystem ecoSystem){
        return new GlobalCommunityAdminWorkArea(workArea,UserAccount,organization,enterprise,ecoSystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.VentureCapitalAdmin.getValue();
}
}
