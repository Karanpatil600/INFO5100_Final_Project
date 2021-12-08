/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemModel.EcoSystem;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.SupplierServiceAdminUI.SupplierServiceAdminUI;
import SystemModel.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class SupplierServiceAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierServiceAdminUI(workArea,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.SupplierServiceAdminRole.getValue();
}
}
