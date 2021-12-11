/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.Organization;
import javax.swing.JPanel;
import SystemModel.EcoSystem;
import SystemModel.Organization.DonorServiceOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.Donor.DonorAdminWorkArea;
import SystemUI.Creator.CreatorAdminWorkArea; 
/**
 *
 * @author adhar
 */
public class DonorAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel workArea ,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DonorAdminWorkArea(workArea,UserAccount,(DonorServiceOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.DonorAdminRole.getValue();
}
    
}




