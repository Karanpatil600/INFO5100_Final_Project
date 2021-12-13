/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import javax.swing.JPanel;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization; 
import SystemModel.UserAccount.UserAccount;
import SystemModel.EcoSystem;
import SystemModel.Organization.SupplierOrganization;
import SystemUI.SupplierManager.SupplierManagerWorkArea;


/**
 *
 * @author Ashish
 */
public class SupplierManagerRole extends Role {   
     @Override
    public JPanel createWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierManagerWorkArea(workArea,UserAccount,(SupplierOrganization)org,enterprise, ESystem);
    
    }
        @Override
        public String toString()
{
   return Role.RoleType.SupplierManagerRole.getValue();
}    
}
