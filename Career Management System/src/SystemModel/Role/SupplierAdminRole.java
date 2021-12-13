/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import javax.swing.JPanel;
import SystemModel.EcoSystem;
import SystemUI.SupplierServiceEnterprise.SupplierAdministratorWorkArea;


/**
 *
 * @author Karan
 */

public class SupplierAdminRole extends Role {
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



