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
import SystemModel.UserAccount.UserAccount;
import SystemUI.SystemAdministrator.SystemAdministrator;



/**
 *
 * @author Karan
 */


public class SystemAdministratorRole extends Role 
{
 
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system)
    {
        return new SystemAdministrator  (workArea , system);
    }
        @Override
        public String toString()
{ 
   return RoleType.SystemAdministrator.getValue();
}
}





