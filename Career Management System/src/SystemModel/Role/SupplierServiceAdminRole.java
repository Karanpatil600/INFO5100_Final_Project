/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemUI.SupplierServiceEnterprise.SupplierAdministratorWorkArea;
import SystemModel.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class SupplierServiceAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierAdministratorWorkArea(workArea,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.SupplierAdminRole.getValue();
}
}
