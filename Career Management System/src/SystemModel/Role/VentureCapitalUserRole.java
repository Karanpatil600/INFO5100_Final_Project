/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.Role.Role.RoleType;
import SystemModel.UserAccount.UserAccount;
import SystemUI.VentureCapitalUser.VentureCapitalUser.VentureCapitalUserWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author Ashish
 */
public class VentureCapitalUserRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel WorkArea, UserAccount UserAccount, Organization org, Enterprise enterprise, EcoSystem ESystem) {
        return new VentureCapitalUserWorkArea(WorkArea, UserAccount, org, enterprise, ESystem);
    }

    @Override
    public String toString() {
        return RoleType.VentureCapitalUserRole.getValue();
    }
}


