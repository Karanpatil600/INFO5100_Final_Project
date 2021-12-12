/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemUI.CareerServiceEnterprise.CareerServiceAdminWorkArea;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class CareerServiceAdminRole extends Role{
       @Override
    public JPanel createWorkArea(JPanel workArea,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new CareerServiceAdminWorkArea(workArea,system, enterprise);
    } 
        @Override
        public String toString()
{
   return Role.RoleType.CareerServiceAdminRole.getValue();
}
}
