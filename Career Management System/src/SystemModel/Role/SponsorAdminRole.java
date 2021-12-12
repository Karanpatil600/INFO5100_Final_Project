/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EnterpriseManagement.Enterprise;
import javax.swing.JPanel;
import SystemModel.EcoSystem;
import SystemModel.Organization.SponsorOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.SponsorAdmin.SponsorAdminWorkArea;

/**
 *
 * @author adhar
 */
public class SponsorAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel workArea ,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SponsorAdminWorkArea(workArea,UserAccount,(SponsorOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.SponsorAdminRole.getValue();
}
    
}




