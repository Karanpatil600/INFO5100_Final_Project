/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role; 

import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.GlobalCommunityOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import javax.swing.JPanel;
import SystemModel.EcoSystem;
import SystemUI.GlobalCommunityManager.ManagerWorkArea;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Karan
 */


public class GlobalCommunityManagerRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel downJPanel, UserAccount UserAccount, Organization org, Enterprise enterprise, EcoSystem ESystem){
        return new ManagerWorkArea(downJPanel,UserAccount,(GlobalCommunityOrganization)org,enterprise, ESystem);
    }
        @Override
        public String toString()
{
   return Role.RoleType.GlobalCommunityManagerRole.getValue();    
}
}



