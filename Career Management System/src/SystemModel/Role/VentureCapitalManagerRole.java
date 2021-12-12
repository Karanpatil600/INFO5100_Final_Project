/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.VentureCapitalOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import javax.swing.JPanel;
import SystemModel.EcoSystem;
import SystemUI.VentureCapitalManager.VentureCapitalManagerWorkArea;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Ashish
 */
public class VentureCapitalManagerRole extends Role{

   
     @Override
    public JPanel createWorkArea(JPanel WorkArea,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new VentureCapitalManagerWorkArea(WorkArea,UserAccount,(VentureCapitalOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.VentureCapitalManagerRole.getValue();
}
    
    
}







