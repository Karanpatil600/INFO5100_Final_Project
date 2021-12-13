/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.Organization.CreatorOrganization;
import SystemModel.Role.Role.RoleType;
import SystemModel.UserAccount.UserAccount;
import SystemUI.Creator.CreatorDashboard;
import javax.swing.JPanel;
/**
 *
 * @author sudar
 */
public class CreatorRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new CreatorDashboard(workArea, account, (CreatorOrganization) organization, enterprise, system);
      
    }

    @Override
    public String toString() {
        return RoleType.CreatorRole.getValue();
    }
}